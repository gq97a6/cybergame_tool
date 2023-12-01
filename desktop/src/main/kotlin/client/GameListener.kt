package client

import classes.Option
import classes.Packet
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.cbor.Cbor
import kotlinx.serialization.decodeFromByteArray
import objects.Game
import objects.Storage
import okhttp3.Response
import okhttp3.WebSocket
import okhttp3.WebSocketListener
import okio.ByteString
import onUpdateLayout

object GameListener : WebSocketListener() {
    override fun onClosed(webSocket: WebSocket, code: Int, reason: String) {
        super.onClosed(webSocket, code, reason)
        GameConnection.status = false
    }

    override fun onFailure(webSocket: WebSocket, t: Throwable, response: Response?) {
        super.onFailure(webSocket, t, response)
        GameConnection.status = false
    }

    override fun onOpen(webSocket: WebSocket, response: Response) {
        GameClient.requestOptions()
        GameClient.requestMoney()
        GameConnection.status = true
    }

    @OptIn(ExperimentalSerializationApi::class)
    override fun onMessage(webSocket: WebSocket, bytes: ByteString) {
        val packet = Cbor.decodeFromByteArray<Packet>(bytes.toByteArray())
        when (packet.type) {
            "money" -> Storage.parseJson<Int>(packet.data)?.let {
                Game.money = it
                onUpdateLayout()
            }

            "option" -> Storage.parseJson<Option>(packet.data)?.let { option ->
                Game.options.indexOfFirst { it.id == option.id }.let {
                    Game.options[it] = option.apply { copyParams() }
                }
                onUpdateLayout()
            }

            "options" -> Storage.parseJsonList<Option>(packet.data).let { options ->
                if (options.isNotEmpty()) Game.updateOptions(options.onEach { it.copyParams() })
                onUpdateLayout()
            }
        }
    }
}
package org.acme.apps


import jakarta.enterprise.context.ApplicationScoped
import jakarta.websocket.*
import jakarta.websocket.server.PathParam
import jakarta.websocket.server.ServerEndpoint
import jakarta.websocket.server.ServerEndpointConfig
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.cbor.Cbor
import kotlinx.serialization.decodeFromByteArray
import kotlinx.serialization.encodeToByteArray
import org.acme.classes.Option
import org.acme.classes.Packet
import org.acme.objects.GPT
import org.acme.objects.Game
import org.acme.objects.GameDatabase
import org.acme.objects.Storage.asJson
import org.acme.objects.Storage.parseJson
import org.acme.objects.Storage.parseJsonList
import java.nio.ByteBuffer
import java.util.concurrent.ConcurrentHashMap


@OptIn(ExperimentalSerializationApi::class)
@ServerEndpoint("/game/{username}")
@ApplicationScoped
class GameApp {
    private var sessions: MutableMap<String, Session> = ConcurrentHashMap<String, Session>()

    @OnOpen
    fun onOpen(session: Session, @PathParam("username") username: String) {
        sessions[username] = session
    }

    @OnClose
    fun onClose(session: Session?, @PathParam("username") username: String) {
        sessions.remove(username)
    }

    @OnError
    fun onError(session: Session?, @PathParam("username") username: String, throwable: Throwable) {
        sessions.remove(username)
    }

    @OnMessage
    fun onMessage(bytes: ByteBuffer, @PathParam("username") username: String) {
        val packet = Cbor.decodeFromByteArray<Packet>(bytes.array())
        when (packet.type) {
            "money" -> parseJson<Int>(packet.data)?.let {
                relay(bytes, username)
                Game.money = it
            }

            "option" -> parseJson<Option>(packet.data)?.let { option ->
                relay(bytes, username)
                Game.options.indexOfFirst { it.id == option.id }.let {
                    Game.options[it] = option
                }
            }

            "options" -> parseJsonList<Option>(packet.data).let { options ->
                if (options.isEmpty()) return@let
                relay(bytes, username)
                Game.updateOptions(options)
            }

            "rMoney" -> answer(username, "money",  Game.money.asJson())
            "rOptions" -> answer(username, "options", Game.options.asJson())

            //Generate recommended by AI and push to clients
            "rRecommend" -> parseJson<String>(packet.data).let { type ->
                if (type == null) return

                CoroutineScope(Dispatchers.IO).launch {
                    GPT.recommend(type)
                    broadcast("options", Game.options.asJson())
                }
            }

            //Push game to database
            "rStore" -> {
                CoroutineScope(Dispatchers.IO).launch {
                    GameDatabase.setMoney(Game.money)
                    GameDatabase.setOptions(Game.options)
                }
            }

            //Get game from database
            "rLoad" -> {
                CoroutineScope(Dispatchers.IO).launch {
                    Game.money = GameDatabase.getMoney()
                    Game.updateOptions(GameDatabase.getOptions())
                    broadcast("options", Game.options.asJson())
                    broadcast("money", Game.money.asJson())
                }
            }

            "ping" -> answer(username, "pong", "")
        }
    }

    fun answer(username: String, type: String, json: String) {
        val array = Cbor.encodeToByteArray(Packet(type, json))
        sessions[username]?.asyncRemote?.sendBinary(ByteBuffer.wrap(array))
    }

    fun broadcast(type: String, json: String) {
        val array = Cbor.encodeToByteArray(Packet(type, json))
        broadcast(ByteBuffer.wrap(array))
    }

    fun broadcast(bytes: ByteBuffer) {
        sessions.values.forEach {
            it.asyncRemote.sendBinary(bytes)
        }
    }

    private fun relay(bytes: ByteBuffer, username: String) {
        sessions.filter { it.key != username }.values.forEach {
            it.asyncRemote.sendBinary(bytes)
        }
    }
}
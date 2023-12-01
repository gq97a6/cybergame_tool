package client

import classes.Option
import classes.Packet
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.cbor.Cbor
import kotlinx.serialization.encodeToByteArray
import objects.Game
import objects.Storage.asJson
import okio.ByteString.Companion.toByteString

@OptIn(ExperimentalSerializationApi::class)
object GameClient {
    fun requestStore() = sendPacket("rStore", "")
    fun requestLoad() = sendPacket("rLoad", "")
    fun requestRecommend(type: String) = sendPacket("rRecommend", type.asJson())
    fun requestMoney() = sendPacket("rMoney", "")
    fun requestOptions() = sendPacket("rOptions", "")
    fun sendMoney() = sendPacket("money", Game.money.asJson())
    fun sendOptions() = sendPacket("options", Game.options.asJson())
    fun sendOption(option: Option) = sendPacket("option", option.asJson())
    fun sendPing() = sendPacket("ping", "")

    private fun sendPacket(type: String, data: String) {
        GameConnection.socket.send(Cbor.encodeToByteArray(Packet(type, data)).toByteString())
    }
}
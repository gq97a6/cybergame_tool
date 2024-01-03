package client

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import mute
import okhttp3.Credentials
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.WebSocket
import onUpdateLayout
import java.util.concurrent.TimeUnit
import kotlin.random.Random

object GameConnection {
    private val credentials = Credentials.basic("user", "DnQXud8E5CNPtHs")
    private val request = Request.Builder().url("ws://one.hostunit.net/game/${Random.nextInt()}").build()
    private val client = OkHttpClient.Builder()
        .readTimeout(0, TimeUnit.MILLISECONDS)
        .authenticator { _, response ->
            response.request
                .newBuilder()
                .header("Authorization", credentials)
                .build()
        }
        .build()

    lateinit var socket: WebSocket
    var status = false
        set(value) {
            field = value
            onUpdateLayout()
        }

    fun begin() {
        CoroutineScope(Dispatchers.IO).launch {
            delay(1000)
            while (true) {
                if (!status) {
                    mute { socket.cancel() }
                    socket = client.newWebSocket(request, GameListener)
                    delay(5000)
                } else delay(100)
            }
        }

        CoroutineScope(Dispatchers.IO).launch {
            delay(1000)
            while (true) {
                if (status) mute { GameClient.sendPing() }
                delay(100)
            }
        }
    }
}
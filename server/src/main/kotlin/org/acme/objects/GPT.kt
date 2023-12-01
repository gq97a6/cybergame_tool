package org.acme.objects

import com.fasterxml.jackson.databind.ObjectMapper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.cbor.Cbor
import kotlinx.serialization.encodeToByteArray
import okhttp3.MediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody
import org.acme.apps.GameApp
import org.acme.availableOptions
import org.acme.classes.Packet
import org.acme.objects.Storage.asJson
import java.nio.ByteBuffer

object GPT {
    suspend fun recommend(type: String) = withContext(Dispatchers.IO) {
        val ids = getGPTResponse(type).split(",")
        Game.options.forEach {
            it.isRecommended = ids.contains(it.id)
        }
    }

    private fun getGPTResponse(type: String): String {
        var system =
            "Jesteś botem mającym za zadanie sugerować w jakie opcje zabezpieczenia systemów informatycznych warto zainwestować.\\n" +
                    "Twoją rolą jest podawanie JEDYNIE listy indeksów opcji odzielonych przecinkiem jakie zalecasz zakupić na podstawie zagrożenia.\\n" +
                    "NIE tłumaczysz swoich wyborów.\\n" +
                    "Podajesz JEDYNIE listę.\\n" +
                    "Zagrożenie: $type\\n" +
                    "Lista dostępnych opcji do zakupu:\\n"

        val notOwnedIds = Game.options.filter { !it.isOwned }.map { it.id }
        availableOptions.filter { notOwnedIds.contains(it.id) }.forEach {
            system += "${it.id}: ${it.name} - ${it.des}\\n"
        }

        val apiKey = "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"

        val client = OkHttpClient()
        val mediaType = MediaType.parse("application/json; charset=utf-8")
        val body = RequestBody.create(
            mediaType,
            """
            {
                "model": "gpt-4-1106-preview",
                "messages": [{"role": "system", "content": "$system"}],
                "temperature": 0.6,
                "max_tokens": 150
            }
            """.trimIndent()
        )

        val request = Request.Builder()
            .url("https://api.openai.com/v1/chat/completions")
            .post(body)
            .addHeader("Authorization", "Bearer $apiKey")
            .addHeader("Content-Type", "application/json")
            .build()

        val response = client.newCall(request).execute()
        val json = response.body()?.string()
        val node = ObjectMapper().readTree(json)

        return if (response.isSuccessful) node.at("/choices/0/message/content").asText()
        else ""
    }
}
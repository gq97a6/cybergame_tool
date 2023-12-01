package org.acme.objects

import io.vertx.mutiny.sqlclient.Tuple
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.acme.apps.PoolApp.Companion.gameClient
import org.acme.classes.Option

object GameDatabase {
    suspend fun getOptions() = withContext(Dispatchers.IO) {
        gameClient.query("SELECT * FROM options").executeAndAwait().map {
            Option(
                it.getString("id"),
                isRecommended = it.getBoolean("isRecommended"),
                isOwned = it.getBoolean("isOwned")
            )
        }
    }

    suspend fun setOptions(options: List<Option>) = withContext(Dispatchers.IO) {
        options.forEach { option ->
            val params = Tuple.tuple()
                .addString(option.id)
                .addBoolean(option.isRecommended)
                .addBoolean(option.isOwned)
                .addBoolean(option.isRecommended)
                .addBoolean(option.isOwned)

            val upsertQuery = """
                INSERT INTO options (id, isRecommended, isOwned) 
                VALUES (?, ?, ?) 
                ON DUPLICATE KEY UPDATE 
                isRecommended = ?, 
                isOwned = ?;
            """.trimIndent()

            gameClient
                .preparedQuery(upsertQuery)
                .executeAndAwait(params)
        }
    }

    suspend fun getMoney() = withContext(Dispatchers.IO) {
        gameClient.query("SELECT value FROM data WHERE name = 'money'")
            .executeAndAwait()
            .first()
            .getString("value")
            .toIntOrNull() ?: 0
    }

    suspend fun setMoney(value: Int) = withContext(Dispatchers.IO) {
        val query = "INSERT INTO data (name, value) VALUES (?, ?) ON DUPLICATE KEY UPDATE value = VALUES(value)"
        val params = Tuple.tuple()
            .addString("money")
            .addInteger(value)

        gameClient
            .preparedQuery(query)
            .executeAndAwait(params)
    }
}
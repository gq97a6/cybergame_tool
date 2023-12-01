package org.acme.apps

import io.quarkus.reactive.datasource.ReactiveDataSource
import io.quarkus.runtime.StartupEvent
import io.vertx.mutiny.mysqlclient.MySQLPool
import jakarta.enterprise.context.ApplicationScoped
import jakarta.enterprise.event.Observes
import jakarta.inject.Inject

@ApplicationScoped
class PoolApp {
    @Inject
    @ReactiveDataSource("game")
    private lateinit var gameClient: MySQLPool

    fun onStart(@Observes event: StartupEvent) {
        Companion.gameClient = gameClient
    }

    companion object {
        lateinit var gameClient: MySQLPool
    }
}
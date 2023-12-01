package org.acme.apps

import io.quarkus.runtime.StartupEvent
import jakarta.enterprise.context.ApplicationScoped
import jakarta.enterprise.event.Observes
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.acme.objects.Game
import org.acme.objects.GameDatabase

@ApplicationScoped
class InitApp {
    fun onStart(@Observes event: StartupEvent) {
        CoroutineScope(Dispatchers.IO).launch {
            Game.money = GameDatabase.getMoney()
            Game.updateOptions(GameDatabase.getOptions())
        }
    }
}
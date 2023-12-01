package org.acme.objects

import org.acme.availableOptions
import org.acme.classes.Option

object Game {
    var money: Int = 0
    val options = availableOptions.onEach {
        it.des = ""
        it.name = ""
    }

    fun updateOptions(list: List<Option>) {
        val options = list.associateBy { it.id }
        Game.options.forEachIndexed { index, option ->
            options[option.id]?.let {
                Game.options[index] = it
            }
        }
    }
}
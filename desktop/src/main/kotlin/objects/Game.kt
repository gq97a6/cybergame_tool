package objects

import availableOptions
import classes.Option
import client.GameClient

object Game {
    var money: Int = 0
    var options = availableOptions

    val cost: Int
        get() = options.filter { it.isSelected && it.isMarked }.sumOf { it.cost }

    fun onCommand(command: String, setCommand: (String) -> Unit, updateLayout: () -> Unit) {
        var correctCommand = true
        when {
            command.startsWith("set money ") -> {
                val value = command.removePrefix("set money ")
                money = value.toIntOrNull() ?: money
                GameClient.sendMoney()
            }

            command.startsWith("add money ") -> {
                val value = command.removePrefix("add money ")
                money += value.toIntOrNull() ?: 0
                GameClient.sendMoney()
            }

            command.startsWith("remove money ") -> {
                val value = command.removePrefix("remove money ")
                money -= value.toIntOrNull() ?: 0
                GameClient.sendMoney()
            }

            command.startsWith("buy") -> {
                money -= cost
                options.filter { it.isSelected && it.isMarked }.forEach {
                    it.isOwned = true
                    GameClient.sendOption(it)
                }
                GameClient.sendMoney()
            }

            command.startsWith("sell") -> {
                money += options.filter { it.isSelected && it.isMarked && it.isOwned }.sumOf { it.cost }
                options.filter { it.isSelected && it.isMarked }.forEach {
                    it.isOwned = false
                    GameClient.sendOption(it)
                }
                GameClient.sendMoney()
            }

            command.startsWith("set owned ") -> {
                val list = command.removePrefix("set owned ").split(" ")
                options.forEach {
                    if (list.contains(it.id)) {
                        it.isOwned = true
                        GameClient.sendOption(it)
                    }
                }
            }

            command.startsWith("recommend") -> {
                val type = command.removePrefix("recommend ")
                GameClient.requestRecommend(type)
            }

            command.startsWith("load") -> GameClient.requestLoad()
            command.startsWith("store") -> GameClient.requestStore()

            else -> correctCommand = false
        }

        if (correctCommand) {
            updateLayout()
            setCommand("")
        }
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
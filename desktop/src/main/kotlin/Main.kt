import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.*
import classes.ListType
import classes.Option
import client.GameClient
import client.GameConnection
import compose.*
import objects.Game

const val corners = 10
var onUpdateLayout: () -> Unit = {}

@Composable
@Preview
fun App() = ComposeTheme {
    var command by remember { mutableStateOf("") }
    var listType by remember { mutableStateOf(ListType.ALL) }
    var isConnected by remember { mutableStateOf(false) }

    var money by remember { mutableStateOf(0) }
    var cost by remember { mutableStateOf(0) }
    var mainList by remember { mutableStateOf(listOf<Option>()) }
    var secondList by remember { mutableStateOf(listOf<Option>()) }

    fun updateLayout() {
        mainList = when (listType) {
            ListType.OWNED -> Game.options.filter { it.isOwned }
            ListType.NOT_OWNED -> Game.options.filter { !it.isOwned }
            ListType.ALL -> Game.options
            ListType.RECOMMENDED -> Game.options.filter { it.isRecommended }
        }

        isConnected = GameConnection.status
        secondList = Game.options.filter { it.isSelected }
        money = Game.money
        cost = Game.cost
    }

    remember {
        onUpdateLayout = { updateLayout() }
        GameConnection.begin()
    }

    Column(
        modifier = Modifier.fillMaxSize()
            .clip(RoundedCornerShape(bottomEnd = 10.dp, bottomStart = 10.dp)).background(Color.White).padding(10.dp),
    ) {
        Row(
            Modifier.fillMaxWidth().weight(1f), verticalAlignment = Alignment.CenterVertically
        ) {
            Column(M.fillMaxHeight().fillMaxWidth(.5f)) {
                MoneyDisplay(money, cost, money - cost)
                MainList(mainList) { e ->
                    Game.options.find { it.id == e.id }?.isSelected = true
                    GameClient.sendOption(e)
                    updateLayout()
                }
            }

            Column(M.fillMaxHeight().fillMaxWidth()) {
                Switches {
                    listType = it
                    updateLayout()
                }

                SecondaryList(secondList, { e ->
                    Game.options.find { it.id == e.id }?.let {
                        it.isSelected = false
                        GameClient.sendOption(e)
                        updateLayout()
                    }
                }, { e ->
                    Game.options.find { it.id == e.id }?.let {
                        it.isMarked = !it.isMarked
                        GameClient.sendOption(e)
                        secondList = listOf() //Force recompose
                        updateLayout()
                    }
                })
            }
        }

        Row(
            Modifier.fillMaxWidth().height(100.dp).padding(10.dp).background(Color(200, 200, 200))
                .padding(start = 20.dp), verticalAlignment = Alignment.CenterVertically
        ) {
            Text("Komenda:", fontSize = 30.sp)

            EditText(
                command,
                modifier = M.weight(1f).fillMaxHeight(),
                textStyle = TextStyle(fontSize = 30.sp),
                onValueChange = { command = it },
            )

            Box(
                Modifier
                    .fillMaxHeight()
                    .clickable { Game.onCommand(command, { command = it }, { updateLayout() }) }
                    .padding(horizontal = 20.dp),
                contentAlignment = Alignment.Center
            ) {
                Text("SEND", fontSize = 20.sp, fontWeight = FontWeight.Black, textAlign = TextAlign.Center)
            }
        }
    }

    if (!isConnected) {
        Box(Modifier.fillMaxWidth().height(10.dp).background(Color(255, 120, 120))) {

        }
    }
}

fun main() = application {
    Window(
        title = "",
        onCloseRequest = ::exitApplication,
        icon = painterResource("logo.svg")
    ) {
        App()
    }
}

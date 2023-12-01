package compose

import M
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import classes.ListType
import classes.Option

@Composable
fun MainList(list: List<Option>, onAdd: (Option) -> Unit) =
    Column(M.fillMaxSize().padding(10.dp).background(Color(200, 200, 200))) {
        LazyColumn(modifier = Modifier.padding(vertical = 4.dp)) {
            items(list.size) { i ->
                Row(
                    Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .padding(10.dp)
                        .background(
                            when {
                                !list[i].isOwned && list[i].isRecommended -> Color(192, 224, 195)
                                !list[i].isOwned -> Color(190, 171, 178)
                                else -> Color(170, 170, 170)
                            }
                        )
                        .padding(10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(Modifier.weight(1f).padding(end = 10.dp)) {
                        Text(
                            "${list[i].id}: ${list[i].name} (${list[i].cost} zł)",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Black
                        )
                        Text(list[i].des, fontSize = 20.sp)
                    }
                    if (!list[i].isSelected) Box(
                        Modifier.size(75.dp).border(1.dp, Color.Black).clickable { onAdd(list[i]) },
                        contentAlignment = Alignment.Center
                    ) {
                        Text("+", fontSize = 50.sp, fontWeight = FontWeight.Black, textAlign = TextAlign.Center)
                    }
                }
            }
        }
    }

@Composable
fun SecondaryList(list: List<Option>, onRemove: (Option) -> Unit, onMark: (Option) -> Unit) =
    Column(M.fillMaxSize().padding(10.dp).background(Color(200, 200, 200))) {
        LazyColumn(modifier = Modifier.padding(vertical = 4.dp)) {
            items(list.size) { i ->
                Row(
                    Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .padding(10.dp)
                        .background(
                            when {
                                !list[i].isOwned && list[i].isRecommended -> Color(192, 224, 195)
                                !list[i].isOwned -> Color(190, 171, 178)
                                else -> Color(170, 170, 170)
                            }
                        )
                        .padding(10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(Modifier.weight(1f).padding(end = 10.dp)) {
                        Text(
                            "${list[i].id}: ${list[i].name} (${list[i].cost} zł)",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Black
                        )
                        Text(list[i].des, fontSize = 20.sp)
                    }
                    Column(Modifier.padding(end = 10.dp), verticalArrangement = Arrangement.SpaceEvenly) {
                        Box(
                            Modifier.size(50.dp).border(1.dp, Color.Black).clickable { onMark(list[i]) },
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                if (list[i].isMarked) "O" else "",
                                fontSize = 35.sp,
                                fontWeight = FontWeight.Black,
                                textAlign = TextAlign.Center
                            )
                        }
                        Spacer(M.height(10.dp))
                        Box(
                            Modifier.size(50.dp).border(1.dp, Color.Black).clickable { onRemove(list[i]) },
                            contentAlignment = Alignment.Center
                        ) {
                            Text("X", fontSize = 35.sp, fontWeight = FontWeight.Black, textAlign = TextAlign.Center)
                        }
                    }
                }
            }
        }
    }

@Composable
fun Switches(
    onChange: (ListType) -> Unit,
) = Row(M.fillMaxWidth().height(100.dp).padding(10.dp), verticalAlignment = Alignment.CenterVertically) {
    Column(M.weight(1f)) {
        Text("OWNED", fontSize = 25.sp, modifier = M.clickable { onChange(ListType.OWNED) })
        Spacer(M.height(15.dp))
        Text("NOT OWNED", fontSize = 25.sp, modifier = M.clickable { onChange(ListType.NOT_OWNED) })
    }

    Column(M.fillMaxWidth().weight(1f), verticalArrangement = Arrangement.SpaceAround) {
        Text("ALL", fontSize = 25.sp, modifier = M.clickable { onChange(ListType.ALL) })
        Spacer(M.height(15.dp))
        Text("RECOMMENDED", fontSize = 25.sp, modifier = M.clickable { onChange(ListType.RECOMMENDED) })
    }
}

@Composable
fun MoneyDisplay(money: Int, spend: Int, result: Int) =
    Row(M.fillMaxWidth().height(100.dp).padding(10.dp), verticalAlignment = Alignment.CenterVertically) {
        BoldStartText(result.toString(), "", fontSize = 50.sp)
        Text(" = ", fontSize = 50.sp)
        BoldStartText(money.toString(), "", fontSize = 50.sp)
        Text(" - ", fontSize = 50.sp)
        BoldStartText(spend.toString(), "", fontSize = 50.sp)
    }
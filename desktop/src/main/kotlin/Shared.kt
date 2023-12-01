import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp

@Composable
fun Dp.toPx() = LocalDensity.current.run { this@toPx.toPx() }

@Composable
fun Float.toDp() = LocalDensity.current.run { this@toDp.toDp() }

val M: Modifier
    get() = Modifier

fun mute(action: () -> Unit) {

}
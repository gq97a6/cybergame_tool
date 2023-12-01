package compose

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

object Colors {
    val a = Color(0f, 0f, 0f)
    val b = Color(0f, 0f, 0f)
    val c = Color(0f, 0f, 0f)
    val d = Color(0f, 0f, 0f)
    val background = Color(207, 207, 207)
}

@Composable
fun EditTextColors() = TextFieldDefaults.outlinedTextFieldColors(
    textColor = Colors.b,
    cursorColor = Colors.b,
    focusedBorderColor = Color.Transparent,
    focusedLabelColor = Colors.a,
    unfocusedBorderColor = Color.Transparent,
    unfocusedLabelColor = Colors.b,
    disabledTextColor = Colors.b,
    disabledBorderColor = Color.Transparent,
    disabledLabelColor = Colors.b,
    leadingIconColor = MaterialTheme.colors.onSurface.copy(alpha = TextFieldDefaults.IconOpacity),
    trailingIconColor = MaterialTheme.colors.onSurface.copy(alpha = TextFieldDefaults.IconOpacity),
)

@Composable
fun SwitchColors() = SwitchDefaults.colors(
    checkedThumbColor = Colors.a,
    checkedTrackColor = Colors.b,
    uncheckedThumbColor = Colors.b,
    uncheckedTrackColor = Colors.c,
)

@Composable
fun RadioButtonColors() = RadioButtonDefaults.colors(
    selectedColor = Colors.a,
    unselectedColor = Colors.c,
)

@Composable
fun CheckBoxColors() = CheckboxDefaults.colors(
    checkedColor = Colors.b,
    uncheckedColor = Colors.a,
    checkmarkColor = Colors.background
)
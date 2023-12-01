package compose

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import corners

@Composable
fun BoldStartText(a: String, b: String, fontSize: TextUnit = 15.sp, modifier: Modifier = Modifier) {
    Row(modifier = modifier) {
        Text(text = a, fontWeight = FontWeight.Bold, fontSize = fontSize, color = Colors.a)
        Text(text = b, fontSize = fontSize, color = Colors.b)
    }
}

@Composable
fun LabeledSwitch(
    label: @Composable (() -> Unit)? = null,
    checked: Boolean,
    onCheckedChange: ((Boolean) -> Unit)?,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) {
    Row(
        modifier = modifier.wrapContentSize(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        label?.invoke()
        Text("OFF", fontSize = 12.sp, color = Colors.b, modifier = Modifier.padding(start = 8.dp))
        Switch(
            checked = checked,
            onCheckedChange = onCheckedChange,
            enabled = enabled,
            colors = SwitchColors(),
            interactionSource = interactionSource,
            modifier = Modifier
                .wrapContentSize()
                .padding(0.dp)
        )
        Text("ON", fontSize = 12.sp, color = Colors.b)
    }
}

@Composable
fun EditText(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier.padding(top = 6.dp).height(60.dp).fillMaxWidth(),
    enabled: Boolean = true,
    readOnly: Boolean = false,
    textStyle: TextStyle = LocalTextStyle.current,
    label: @Composable (() -> Unit)? = null,
    placeholder: @Composable (() -> Unit)? = null,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    isError: Boolean = false,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    singleLine: Boolean = true,
    maxLines: Int? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    shape: Shape = MaterialTheme.shapes.small
) {
    OutlinedTextField(
        enabled = enabled,
        readOnly = readOnly,
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
        singleLine = singleLine,
        textStyle = textStyle,
        label = label,
        placeholder = placeholder,
        leadingIcon = leadingIcon,
        trailingIcon = trailingIcon,
        isError = isError,
        visualTransformation = visualTransformation,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        maxLines = maxLines ?: 1,
        interactionSource = interactionSource,
        shape = shape,
        colors = EditTextColors()
    )
}

@Composable
fun RadioGroup(
    options: List<String> = listOf(),
    label: String = "",
    selected: Int,
    onClick: ((Int) -> Unit),
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        Text(text = label, fontSize = 15.sp, color = Colors.a)
        options.forEachIndexed { index, item ->
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(top = 15.dp)
            ) {
                RadioButton(
                    selected = index == selected,
                    onClick = { onClick(index) },
                    modifier = Modifier
                        .width(20.dp)
                        .height(25.dp),
                    colors = RadioButtonColors()
                )

                val annotatedText = buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            color = if (index == selected) Colors.b else Colors.c,
                            fontSize = 15.sp
                        )
                    )
                    { append(item) }
                }

                ClickableText(
                    text = annotatedText,
                    onClick = { onClick(index) },
                    modifier = Modifier.padding(start = 5.dp)
                )
            }
        }
    }
}

@Composable
fun HorizontalRadioGroup(
    options: List<String> = listOf(),
    label: String = "",
    selected: Int,
    onClick: ((Int) -> Unit),
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.padding(vertical = 13.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = label, fontSize = 15.sp, color = Colors.a)
        options.forEachIndexed { index, item ->
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(start = 10.dp)
            ) {
                RadioButton(
                    selected = index == selected,
                    onClick = { onClick(index) },
                    modifier = Modifier
                        .width(20.dp)
                        .height(25.dp),
                    colors = RadioButtonColors()
                )

                val annotatedText = buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            color = if (index == selected) Colors.a else Colors.b,
                            fontSize = 15.sp
                        )
                    )
                    { append(item) }
                }

                ClickableText(
                    text = annotatedText,
                    onClick = { onClick(index) },
                    modifier = Modifier.padding(start = 5.dp)
                )
            }
        }
    }
}

inline fun Modifier.nrClickable(crossinline onClick: () -> Unit): Modifier = composed {
    clickable(indication = null,
        interactionSource = remember { MutableInteractionSource() }) {
        onClick()
    }
}

@Composable
fun LabeledCheckbox(
    label: @Composable (() -> Unit),
    checked: Boolean,
    onCheckedChange: ((Boolean) -> Unit),
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) {
    Row(
        modifier = modifier.nrClickable(onClick = { onCheckedChange(!checked) }),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Checkbox(
            modifier = Modifier
                .width(20.dp)
                .height(20.dp),
            checked = checked,
            enabled = enabled,
            interactionSource = interactionSource,
            colors = CheckBoxColors(),
            onCheckedChange = onCheckedChange
        )
        Spacer(modifier = Modifier.padding(5.dp))
        label()
    }
}

@Composable
inline fun FrameBox(
    a: String = "",
    b: String = "",
    modifier: Modifier = Modifier.fillMaxSize(),
    crossinline content: @Composable () -> Unit
) {
    Column {
        BoldStartText(
            a = a,
            b = b,
            modifier = Modifier.padding(start = 5.dp, bottom = 3.dp, top = 15.dp)
        )

        Surface(
            modifier = modifier
                .border(BorderStroke(1.dp, Colors.a), RoundedCornerShape(10.dp))
                .padding(12.dp)
        ) {
            content()
        }
    }
}

@Composable
fun BasicButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    shape: Shape = RoundedCornerShape(corners.dp),
    border: BorderStroke = BorderStroke(2.dp, Colors.b),
    contentPadding: PaddingValues = PaddingValues(13.dp),
    contentAlignment: Alignment = Alignment.Center,
    content: @Composable () -> Unit
) {
    Box(
        modifier = modifier
            .clickable(enabled, role = Role.Button, onClick = onClick)
            .border(border, shape)
            .padding(contentPadding)
            .clip(shape),
        contentAlignment = contentAlignment
    ) {
        content()
    }
}

@Composable
fun PlainButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    content: @Composable () -> Unit
) {
    Box(
        modifier = modifier
            .clickable(
                true,
                role = Role.Button,
                onClick = onClick
            ),
        contentAlignment = Alignment.Center
    ) {
        content()
    }
}
package compose

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Shapes
import androidx.compose.material.lightColors
import androidx.compose.material.ripple.LocalRippleTheme
import androidx.compose.material.ripple.RippleAlpha
import androidx.compose.material.ripple.RippleTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

val ColorPalette: androidx.compose.material.Colors
    get() = lightColors(
        primary = Color.Black,
        primaryVariant = Color.Black,
        secondary = Color.Black,
        secondaryVariant = Color.Black,
        background = Colors.background,
        surface = Color.Transparent,
        onPrimary = Color.Black,
        onSecondary = Color.Black,
        onBackground = Color.Black,
        onSurface = Color.Black
    )

@Composable
fun ComposeTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colors = ColorPalette,
        shapes = Shapes(
            small = RoundedCornerShape(4.dp),
            medium = RoundedCornerShape(4.dp),
            large = RoundedCornerShape(4.dp)
        )
    ) {
        CompositionLocalProvider(
            LocalRippleTheme provides object : RippleTheme {
                @Composable
                override fun defaultColor(): Color = Color.Black

                @Composable
                override fun rippleAlpha(): RippleAlpha = RippleAlpha(.2f, .2f, .1f, .2f)
                //RippleTheme.defaultRippleAlpha(androidx.compose.ui.graphics.Color.Black, lightTheme = !isSystemInDarkTheme())
            },
            content = content
        )
    }
}
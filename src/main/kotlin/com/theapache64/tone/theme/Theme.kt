package com.theapache64.tone.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.theapache64.tone.composables.ToolBar

// Colors


// Color set
val LightTheme = lightColors()
val DarkTheme = darkColors(
    primary = R.color.TelegramBlue,
    onPrimary = Color.White,

    secondary = R.color.BrightGray,
    onSecondary = Color.White,

    surface = R.color.WoodSmoke,
)

@Composable
fun ColorMusk(
    title: String = "",
    displayToolbar: Boolean = true,
    isDark: Boolean = true,
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colors = if (isDark) DarkTheme else LightTheme,
        typography = StackzyTypography
    ) {
        Surface {
            Column {
                if (displayToolbar) {
                    Column {
                        ToolBar(
                            title = title
                        )
                        content()
                    }
                } else {
                    content()
                }
            }
        }
    }
}
package com.marinj.shoppingwarfare.android.core.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = purpleDark,
    primaryVariant = purple,
    secondary = purpleLight
)

// private val LightColorPalette = lightColors(
//    primary = purple500,
//    primaryVariant = purple700,
//    secondary = teal200,
//    background = white,
// )

@Composable
fun ShoppingWarfareTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
//    val colors = if (darkTheme) {
//        DarkColorPalette
//    } else {
//        LightColorPalette
//    }

    MaterialTheme(
        colors = DarkColorPalette,
        typography = crossingTypography,
        shapes = shapes,
        content = content
    )
}

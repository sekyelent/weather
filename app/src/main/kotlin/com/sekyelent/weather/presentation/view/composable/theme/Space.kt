package com.sekyelent.weather.presentation.view.composable.theme


import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

class Space(
    val extraSmall: Dp = SpaceDefaults.ExtraSmall,
    val small: Dp = SpaceDefaults.Small,
    val medium: Dp = SpaceDefaults.Normal,
    val large: Dp = SpaceDefaults.Large,
    val extraLarge: Dp = SpaceDefaults.ExtraLarge
) {

}

object SpaceDefaults {
    val ExtraSmall: Dp = 4.0.dp
    val Small: Dp = 8.0.dp
    val Normal: Dp = 16.0.dp
    val Large: Dp = 24.0.dp
    val ExtraLarge: Dp = 32.0.dp
}

internal val LocalSpaces = staticCompositionLocalOf { Space() }
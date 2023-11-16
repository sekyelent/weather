package com.sekyelent.weather.presentation.view.composable.theme

import androidx.compose.runtime.staticCompositionLocalOf

class Ratio {
    val square: Float = RatioDefaults.Square
}

object RatioDefaults {
    val Square: Float = 1.0f
}

internal val LocalRatio = staticCompositionLocalOf { Ratio() }
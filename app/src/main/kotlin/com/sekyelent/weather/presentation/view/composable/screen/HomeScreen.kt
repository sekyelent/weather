package com.sekyelent.weather.presentation.view.composable.screen

import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.sekyelent.weather.presentation.view.composable.theme.WeatherTheme

@Composable
fun HomeScreen() {
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Card(
            modifier = Modifier
                .aspectRatio(WeatherTheme.ratio.square)
                .padding(WeatherTheme.space.extraLarge)
        ) {

        }
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    WeatherTheme {
        HomeScreen()
    }
}

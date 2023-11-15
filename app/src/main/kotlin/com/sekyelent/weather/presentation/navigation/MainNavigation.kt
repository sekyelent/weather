package com.sekyelent.weather.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.sekyelent.weather.presentation.view.composable.screen.HomeScreen
import com.sekyelent.weather.presentation.view.composable.theme.WeatherTheme
import com.sekyelent.weather.presentation.viewmodel.WeatherViewModel

@Composable
fun MainNavigation() {
    val navController = rememberNavController()
    val viewModel = hiltViewModel<WeatherViewModel>()

    NavHost(navController = navController, startDestination = "") {
        composable(route = "") {
            WeatherTheme {
                HomeScreen()
            }
        }
    }
}
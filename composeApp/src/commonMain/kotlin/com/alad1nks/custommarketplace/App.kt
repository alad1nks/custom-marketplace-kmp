package com.alad1nks.custommarketplace

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.alad1nks.custommarketplace.feature.home.navigation.HomeRoute
import com.alad1nks.custommarketplace.feature.home.navigation.homeScreen
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.KoinApplication

@Composable
fun KoinApp() {
    KoinApplication(
        application = {
            modules(getPlatformModules() + getCommonModules())
        },
    ) {
        App()
    }
}

@Composable
@Preview
private fun App() {
    val navController = rememberNavController()

    MaterialTheme {
        Scaffold {
            NavHost(
                navController = navController,
                startDestination = HomeRoute,
            ) {
                homeScreen()
            }
        }
    }
}

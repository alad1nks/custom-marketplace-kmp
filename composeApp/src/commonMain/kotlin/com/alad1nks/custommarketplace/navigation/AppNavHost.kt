package com.alad1nks.custommarketplace.navigation

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import com.alad1nks.custommarketplace.feature.collections.navigation.collectionsScreen
import com.alad1nks.custommarketplace.feature.home.navigation.HomeRoute
import com.alad1nks.custommarketplace.feature.home.navigation.homeScreen
import com.alad1nks.custommarketplace.ui.AppState

@Composable
internal fun AppNavHost(
    appState: AppState,
    modifier: Modifier = Modifier,
    startDestination: Any = HomeRoute,
) {
    val navController = appState.navController

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier,
        enterTransition = { EnterTransition.None },
        exitTransition = { ExitTransition.None },
    ) {
        homeScreen()
        collectionsScreen()
    }
}

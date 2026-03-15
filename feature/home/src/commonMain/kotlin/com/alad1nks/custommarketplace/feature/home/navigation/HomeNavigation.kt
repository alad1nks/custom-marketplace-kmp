package com.alad1nks.custommarketplace.feature.home.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptionsBuilder
import androidx.navigation.compose.composable
import com.alad1nks.custommarketplace.feature.home.ui.HomeRoute
import com.alad1nks.custommarketplace.feature.home.ui.HomeViewModel
import kotlinx.serialization.Serializable
import org.koin.compose.viewmodel.koinViewModel
import org.koin.core.parameter.parametersOf

@Serializable
data object HomeRoute

fun NavController.navigateToHome(
    navOptions: NavOptionsBuilder.() -> Unit = {},
) {
    navigate(
        route = HomeRoute,
        builder = navOptions,
    )
}

fun NavGraphBuilder.homeScreen() {
    composable<HomeRoute> {
        val viewModel =
            koinViewModel<HomeViewModel>(
                parameters = { parametersOf() },
            )

        HomeRoute(
            viewModel = viewModel,
        )
    }
}

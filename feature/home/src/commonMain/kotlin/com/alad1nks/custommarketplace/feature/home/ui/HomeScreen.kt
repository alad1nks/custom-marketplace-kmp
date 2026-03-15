package com.alad1nks.custommarketplace.feature.home.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
internal fun HomeRoute(
    viewModel: HomeViewModel,
    modifier: Modifier = Modifier,
) {
    HomeScreen(
        modifier = modifier,
    )
}

@Composable
private fun HomeScreen(
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier.fillMaxSize(),
    )
}

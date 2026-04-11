package com.alad1nks.custommarketplace.feature.home.ui

import androidx.lifecycle.ViewModel
import com.alad1nks.custommarketplace.core.domain.GetHomeItems
import kotlinx.coroutines.flow.StateFlow

internal class HomeViewModel(
    getHomeItems: GetHomeItems,
) : ViewModel() {
    val items: StateFlow<List<String>> = getHomeItems()
}

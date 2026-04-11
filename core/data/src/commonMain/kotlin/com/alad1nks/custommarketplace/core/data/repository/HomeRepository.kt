package com.alad1nks.custommarketplace.core.data.repository

import com.alad1nks.custommarketplace.core.firebase.HomeApi
import kotlinx.coroutines.flow.StateFlow

class HomeRepository(
    private val homeApi: HomeApi,
) {
    fun getItems(): StateFlow<List<String>> {
        return homeApi.getItems()
    }
}

package com.alad1nks.custommarketplace.core.firebase

import kotlinx.coroutines.flow.StateFlow

interface HomeApi {
    fun getItems(): StateFlow<List<String>>
}

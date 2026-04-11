package com.alad1nks.custommarketplace.core.domain

import com.alad1nks.custommarketplace.core.data.repository.HomeRepository
import kotlinx.coroutines.flow.StateFlow

class GetHomeItems(
    private val homeRepository: HomeRepository,
) {
    operator fun invoke(): StateFlow<List<String>> {
        return homeRepository.getItems()
    }
}

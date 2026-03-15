package com.alad1nks.custommarketplace

import com.alad1nks.custommarketplace.feature.collections.di.CollectionsModule
import com.alad1nks.custommarketplace.feature.home.di.HomeModule
import org.koin.core.module.Module

fun getCommonModules(): List<Module> {
    return listOf(
        CollectionsModule,
        HomeModule,
    )
}

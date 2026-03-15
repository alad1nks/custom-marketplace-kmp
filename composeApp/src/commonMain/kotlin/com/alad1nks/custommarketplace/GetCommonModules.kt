package com.alad1nks.custommarketplace

import com.alad1nks.custommarketplace.feature.home.di.HomeModule
import org.koin.core.module.Module

fun getCommonModules(): List<Module> {
    return listOf(HomeModule)
}

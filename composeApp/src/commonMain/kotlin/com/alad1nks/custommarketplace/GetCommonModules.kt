package com.alad1nks.custommarketplace

import com.alad1nks.custommarketplace.core.data.di.DataModule
import com.alad1nks.custommarketplace.core.domain.di.DomainModule
import com.alad1nks.custommarketplace.core.firebase.di.FirebaseModule
import com.alad1nks.custommarketplace.feature.collections.di.CollectionsModule
import com.alad1nks.custommarketplace.feature.home.di.HomeModule
import org.koin.core.module.Module

fun getCommonModules(): List<Module> {
    return listOf(
        CollectionsModule,
        DataModule,
        DomainModule,
        FirebaseModule,
        HomeModule,
    )
}

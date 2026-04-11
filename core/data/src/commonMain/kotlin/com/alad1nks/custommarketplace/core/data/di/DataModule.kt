package com.alad1nks.custommarketplace.core.data.di

import com.alad1nks.custommarketplace.core.data.repository.HomeRepository
import org.koin.dsl.module

val DataModule =
    module {
        single { HomeRepository(get()) }
    }

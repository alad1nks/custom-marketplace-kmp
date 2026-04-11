package com.alad1nks.custommarketplace.core.domain.di

import com.alad1nks.custommarketplace.core.domain.GetHomeItems
import org.koin.dsl.module

val DomainModule =
    module {
        factory { GetHomeItems(get()) }
    }

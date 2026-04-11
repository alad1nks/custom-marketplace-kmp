package com.alad1nks.custommarketplace.core.firebase.di

import com.alad1nks.custommarketplace.core.firebase.HomeApi
import com.alad1nks.custommarketplace.core.firebase.HomeApiImpl
import org.koin.dsl.module

actual val FirebaseModule =
    module {
        single<HomeApi> { HomeApiImpl() }
    }

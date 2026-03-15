package com.alad1nks.custommarketplace

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.KoinApplication

@Composable
fun KoinApp() {
    KoinApplication(
        application = {
            modules(getPlatformModules() + getCommonModules())
        },
    ) {
        App()
    }
}

@Composable
@Preview
fun App() {
    MaterialTheme {
        Scaffold {
        }
    }
}

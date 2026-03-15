package com.alad1nks.custommarketplace

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.alad1nks.custommarketplace.ui.App

fun main() =
    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "custommarketplace",
        ) {
            App()
        }
    }

package com.alad1nks.custommarketplace

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform

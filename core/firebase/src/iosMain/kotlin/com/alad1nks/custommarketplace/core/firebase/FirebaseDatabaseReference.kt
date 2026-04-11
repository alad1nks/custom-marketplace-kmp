package com.alad1nks.custommarketplace.core.firebase

import cocoapods.FirebaseDatabase.FIRDatabase
import kotlinx.cinterop.ExperimentalForeignApi

internal object FirebaseDatabaseReference {
    @OptIn(ExperimentalForeignApi::class)
    val database = FIRDatabase.database().reference()
}

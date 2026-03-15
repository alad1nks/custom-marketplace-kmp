package com.alad1nks.custommarketplace.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.outlined.Home
import androidx.compose.ui.graphics.vector.ImageVector
import com.alad1nks.custommarketplace.core.navigation.Destination
import com.alad1nks.custommarketplace.core.navigation.serialName
import com.alad1nks.custommarketplace.feature.home.navigation.HomeRoute
import com.alad1nks.custommarketplace.resources.AppResource
import org.jetbrains.compose.resources.StringResource

internal enum class AppTopLevelDestination(
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val labelStringResource: StringResource,
    val route: Destination,
) {
    HOME(
        selectedIcon = Icons.Filled.Home,
        unselectedIcon = Icons.Outlined.Home,
        labelStringResource = AppResource.String.home_tab_label,
        route = HomeRoute,
    ),
}

internal fun AppTopLevelDestination.routeSerialName(): String? {
    return when (this.route) {
        HomeRoute -> HomeRoute.serialName()
        else -> null
    }
}

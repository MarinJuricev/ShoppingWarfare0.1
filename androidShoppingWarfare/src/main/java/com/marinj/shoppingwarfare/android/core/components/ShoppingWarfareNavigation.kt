package com.marinj.shoppingwarfare.android.core.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.marinj.shoppingwarfare.android.BottomNavigationItem
import com.marinj.shoppingwarfare.android.feature.cart.CartPage
import com.marinj.shoppingwarfare.android.feature.grocery.GroceryPage
import com.marinj.shoppingwarfare.android.feature.history.HistoryPage
import com.marinj.shoppingwarfare.android.feature.user.UserPage

@Composable
fun ShoppingWarfareNavigation() {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            BottomNavigation {
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentDestination = navBackStackEntry?.destination

                BottomNavigationItem.navigationItems.forEach { screen ->
                    BottomNavigationItem(
                        icon = {
                            Icon(
                                painter = painterResource(screen.iconId),
                                contentDescription = screen.route
                            )
                        },
                        label = { Text(stringResource(id = screen.resourceId)) },
                        selected = currentDestination?.hierarchy?.any { it.route == screen.route } == true,
                        alwaysShowLabel = false,
                        onClick = {
                            navController.navigate(screen.route) {
                                // Pop up to the start destination of the graph to
                                // avoid building up a large stack of destinations
                                // on the back stack as users select items
                                popUpTo(navController.graph.findStartDestination().id) {
                                    saveState = true
                                }
                                // Avoid multiple copies of the same destination when
                                // reselecting the same item
                                launchSingleTop = true
                                // Restore state when reselecting a previously selected item
                                restoreState = true
                            }
                        }
                    )
                }
            }
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = BottomNavigationItem.Grocery.route,
            Modifier.padding(innerPadding)
        ) {
            composable(BottomNavigationItem.Grocery.route) { GroceryPage() }
            composable(BottomNavigationItem.Cart.route) { CartPage() }
            composable(BottomNavigationItem.History.route) { HistoryPage() }
            composable(BottomNavigationItem.User.route) { UserPage() }
        }
    }
}

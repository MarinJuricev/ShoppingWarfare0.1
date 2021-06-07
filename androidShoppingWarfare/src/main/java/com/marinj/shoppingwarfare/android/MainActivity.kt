package com.marinj.shoppingwarfare.android

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.marinj.shoppingwarfare.android.feature.shoppinglist.ShoppingListPage
import com.marinj.shoppingwarfare.android.feature.shoppinglist.ShoppingListPageRouteName

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()

            NavHost(navController = navController, startDestination = ShoppingListPageRouteName){
                composable(route = ShoppingListPageRouteName){
                    ShoppingListPage()
                }
            }
        }
    }
}

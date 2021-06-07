package com.marinj.shoppingwarfare.android.feature.shoppinglist

import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import com.marinj.shoppingwarfare.Greeting

const val ShoppingListPageRouteName = "/list"

@Composable
fun ShoppingListPage() {
    Scaffold(
        topBar = {
            TopAppBar {
                Text("AppName")
            }
        }
    ) {
        Text(Greeting().greeting())
    }
}
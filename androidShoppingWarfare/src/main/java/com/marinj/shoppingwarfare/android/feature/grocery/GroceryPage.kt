package com.marinj.shoppingwarfare.android.feature.grocery

import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import com.marinj.shoppingwarfare.Greeting

@Composable
fun GroceryPage() {
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

package com.marinj.shoppingwarfare.android

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import com.marinj.shoppingwarfare.android.core.components.ShoppingWarfareNavigation
import com.marinj.shoppingwarfare.android.core.theme.ShoppingWarfareTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ShoppingWarfareTheme {
                ShoppingWarfareNavigation()
            }
        }
    }
}

package com.marinj.shoppingwarfare.android

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import com.marinj.shoppingwarfare.android.core.components.ShoppingWarfareNavigation

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ShoppingWarfareNavigation()
        }
    }
}

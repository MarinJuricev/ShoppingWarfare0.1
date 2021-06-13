package com.marinj.shoppingwarfare.android

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

sealed class BottomNavigationItem(
    val route: String,
    @StringRes val resourceId: Int,
    @DrawableRes val iconId: Int,
) {
    object Grocery : BottomNavigationItem("grocery", R.string.grocery, R.drawable.grocery_icon)
    object Cart : BottomNavigationItem("cart", R.string.cart, R.drawable.cart_icon)
    object History : BottomNavigationItem("history", R.string.history, R.drawable.history_icon)
    object User : BottomNavigationItem("user", R.string.user, R.drawable.user_icon)

    companion object {
        val navigationItems = listOf(
            Grocery,
            Cart,
            History,
            User,
        )
    }
}

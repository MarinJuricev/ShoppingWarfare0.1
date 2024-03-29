package com.marinj.shoppingwarfare.android.core.components

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.marinj.shoppingwarfare.android.R

sealed class BottomNavigationItem(
    val route: String,
    @StringRes val resourceId: Int,
    @DrawableRes val iconId: Int,
) {
    object Category : BottomNavigationItem("category", R.string.category, R.drawable.category_icon)
    object Cart : BottomNavigationItem("cart", R.string.cart, R.drawable.cart_icon)
    object History : BottomNavigationItem("history", R.string.history, R.drawable.history_icon)
    object User : BottomNavigationItem("user", R.string.user, R.drawable.user_icon)

    companion object {
        val navigationItems = listOf(
            Category,
            Cart,
            History,
            User,
        )
    }
}

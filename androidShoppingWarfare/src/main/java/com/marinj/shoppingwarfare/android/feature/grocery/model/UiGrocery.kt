package com.marinj.shoppingwarfare.android.feature.grocery.model

import androidx.annotation.DrawableRes

data class UiGrocery(
    private val id: Int,
    private val title: String,
    @DrawableRes private val iconId: Int
)

package com.marinj.shoppingwarfare.android.feature.grocery

import com.marinj.shoppingwarfare.android.feature.grocery.model.UiGrocery

data class GroceryViewState(
    val isLoading: Boolean = true,
    val errorMessage: String = "",
    val groceries: List<UiGrocery> = emptyList(),
)

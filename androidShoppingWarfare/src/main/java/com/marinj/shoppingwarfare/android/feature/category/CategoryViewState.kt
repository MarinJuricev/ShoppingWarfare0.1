package com.marinj.shoppingwarfare.android.feature.category

import com.marinj.shoppingwarfare.android.feature.category.model.UiCategory

data class CategoryViewState(
    val isLoading: Boolean = true,
    val errorMessage: String = "",
    val categories: List<UiCategory> = emptyList(),
)

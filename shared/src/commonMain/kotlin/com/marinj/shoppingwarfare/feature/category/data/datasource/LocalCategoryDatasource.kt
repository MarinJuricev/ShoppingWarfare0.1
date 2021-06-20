package com.marinj.shoppingwarfare.feature.category.data.datasource

import com.marinj.shoppingwarfare.core.data.datasource.LocalCategory
import com.marinj.shoppingwarfare.feature.category.domain.model.Category
import kotlinx.coroutines.flow.Flow

interface LocalCategoryDatasource {
    fun getCategoryList(): Flow<List<LocalCategory>>
    fun upsertCategory(category: Category)
    fun deleteCategoryById(id: Int)
}
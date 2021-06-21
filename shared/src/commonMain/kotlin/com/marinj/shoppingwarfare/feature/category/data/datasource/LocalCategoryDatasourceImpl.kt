package com.marinj.shoppingwarfare.feature.category.data.datasource

import com.marinj.shoppingwarfare.core.data.datasource.LocalCategory
import com.marinj.shoppingwarfare.core.data.datasource.ShoppingWarfareDatabaseQueries
import com.marinj.shoppingwarfare.feature.category.domain.model.Category
import com.squareup.sqldelight.runtime.coroutines.asFlow
import com.squareup.sqldelight.runtime.coroutines.mapToList
import kotlinx.coroutines.flow.Flow

class LocalCategoryDatasourceImpl(
    private val shoppingWarfareDatabaseQueries: ShoppingWarfareDatabaseQueries,
) : LocalCategoryDatasource {

    override fun getCategoryList(): Flow<List<LocalCategory>> =
        shoppingWarfareDatabaseQueries.selectAll().asFlow().mapToList()

    override fun upsertCategory(category: Category) =
        shoppingWarfareDatabaseQueries.insertItem(
            id = null,
            name = category.title
        )

    override fun deleteCategoryById(id: Int) =
        shoppingWarfareDatabaseQueries.deleteCategoryById(id)
}

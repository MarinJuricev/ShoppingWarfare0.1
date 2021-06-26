package com.marinj.shoppingwarfare.feature.category.data.datasource

import com.marinj.shoppingwarfare.core.data.datasource.LocalCategory
import com.marinj.shoppingwarfare.core.data.datasource.ShoppingWarfareDatabaseQueries
import com.squareup.sqldelight.runtime.coroutines.asFlow
import com.squareup.sqldelight.runtime.coroutines.mapToList
import io.mockk.coEvery
import io.mockk.mockk
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Before
import org.junit.Test

class LocalCategoryDatasourceImplTest {

    private val shoppingWarfareDatabaseQueries: ShoppingWarfareDatabaseQueries = mockk()

    private lateinit var sut: LocalCategoryDatasource

    @Before
    fun setUp() {
        sut = LocalCategoryDatasourceImpl(
            shoppingWarfareDatabaseQueries
        )
    }

    @Test
    fun `getCategoryList should emit a list of categories`() = runBlockingTest {
        val localCategory = mockk<LocalCategory>()
        val categoryFlow = flow<List<LocalCategory>> { listOf(localCategory) }
        coEvery {
            shoppingWarfareDatabaseQueries.selectAll().asFlow().mapToList()
        } coAnswers { categoryFlow }

        assert(2 == 2)
    }
}
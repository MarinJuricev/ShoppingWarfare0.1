package com.marinj.shoppingwarfare.feature.category.di

import com.marinj.shoppingwarfare.feature.category.data.datasource.LocalCategoryDatasource
import com.marinj.shoppingwarfare.feature.category.data.datasource.LocalCategoryDatasourceImpl
import org.koin.dsl.module

val categoryModule = module {
    factory<LocalCategoryDatasource> { LocalCategoryDatasourceImpl(get()) }
}

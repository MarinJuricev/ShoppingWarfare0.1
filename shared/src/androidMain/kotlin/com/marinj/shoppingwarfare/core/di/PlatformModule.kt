package com.marinj.shoppingwarfare.core.di

import com.marinj.shoppingwarfare.core.data.datasource.DatabaseDriverFactory
import com.marinj.shoppingwarfare.core.data.datasource.ShoppingWarfareDatabase
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

actual fun platformModule() = module {
    single { DatabaseDriverFactory(androidContext()) }
    single {
        ShoppingWarfareDatabase(get<DatabaseDriverFactory>().create())
            .shoppingWarfareDatabaseQueries
    }
}

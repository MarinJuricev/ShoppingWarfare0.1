package com.marinj.shoppingwarfare.core.data.datasource

import com.marinj.shoppingwarfare.core.data.constants.Constants
import com.squareup.sqldelight.db.SqlDriver
import com.squareup.sqldelight.drivers.native.NativeSqliteDriver

actual class DatabaseDriverFactory {
    actual fun create(): SqlDriver {
        return NativeSqliteDriver(ShoppingWarfareDatabase.Schema, Constants.GROCERY_DB_NAME)
    }
}

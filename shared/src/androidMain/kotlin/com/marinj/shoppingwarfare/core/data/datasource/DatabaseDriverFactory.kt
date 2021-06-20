package com.marinj.shoppingwarfare.core.data.datasource

import android.content.Context
import com.marinj.shoppingwarfare.core.data.constants.Constants
import com.squareup.sqldelight.android.AndroidSqliteDriver
import com.squareup.sqldelight.db.SqlDriver

actual class DatabaseDriverFactory(
    private val context: Context,
) {
    actual fun create(): SqlDriver {
        return AndroidSqliteDriver(
            ShoppingWarfareDatabase.Schema,
            context,
            Constants.GROCERY_DB_NAME,
        )
    }
}
package com.marinj.shoppingwarfare.android

import android.app.Application
import org.koin.core.context.startKoin

class ShoppingWarfareApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            printLogger()
            modules()
        }
    }
}

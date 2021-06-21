package com.marinj.shoppingwarfare.android

import android.app.Application
import com.marinj.shoppingwarfare.core.di.initKoin
import dagger.hilt.android.HiltAndroidApp
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger

@HiltAndroidApp
class ShoppingWarfareApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        initKoin {
            androidLogger()
            androidContext(this@ShoppingWarfareApplication)
        }
    }
}

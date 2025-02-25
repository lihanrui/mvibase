package com.illume.mvibase

import android.app.Application
import com.illume.mvibase.di.DatabaseModule
import com.illume.mvibase.di.ViewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class ExampleBaseApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@ExampleBaseApplication)
            modules (
                listOf(
                    DatabaseModule,
                    ViewModelModule
                )
            )
        }
    }
}
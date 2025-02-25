package com.illume.mvibase.di

import androidx.room.Room.databaseBuilder
import com.illume.mvibase.domain.repository.ExampleRepository
import com.illume.mvibase.database.local.EXAMPLE_DB_NAME
import com.illume.mvibase.database.local.ExampleDatabase
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val DatabaseModule = module {
    single {
        databaseBuilder(androidApplication(), ExampleDatabase::class.java, EXAMPLE_DB_NAME)
            .build()
    }
    single {
        get<ExampleDatabase>().exampleDao()
    }
    single {
        ExampleRepository(get())
    }
}
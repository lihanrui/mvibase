package com.illume.mvibase.database.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.illume.mvibase.database.ExampleDao
import com.illume.mvibase.domain.ExampleDatabaseTable

val EXAMPLE_DB_NAME = "Your Database Name here"

@Database(entities = [ExampleDatabaseTable::class], version = 1)
abstract class ExampleDatabase : RoomDatabase() {
    abstract fun exampleDao(): ExampleDao
}
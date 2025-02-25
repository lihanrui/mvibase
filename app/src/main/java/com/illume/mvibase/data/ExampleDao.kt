package com.illume.mvibase.data

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface ExampleDao {
    @Query("SELECT * FROM example_table")
    fun getAll(): Flow<List<ExampleDatabaseTable>>
}
package com.illume.mvibase.database

import androidx.room.Dao
import androidx.room.Query
import com.illume.mvibase.domain.ExampleDatabaseTable
import kotlinx.coroutines.flow.Flow

@Dao
interface ExampleDao {
    @Query("SELECT * FROM example_table")
    fun getAll(): Flow<List<ExampleDatabaseTable>>
}
package com.illume.mvibase.domain.repository

import com.illume.mvibase.database.ExampleDao
import com.illume.mvibase.domain.ExampleDatabaseTable
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn

class ExampleRepository(private val exampleDao: ExampleDao) {
    fun getAllExampleUnits(): Flow<List<ExampleDatabaseTable>> {
        return exampleDao.getAll().flowOn(Dispatchers.IO)
    }
}
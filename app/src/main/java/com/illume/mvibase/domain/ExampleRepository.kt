package com.illume.mvibase.domain

import com.illume.mvibase.data.ExampleDao
import com.illume.mvibase.data.ExampleDatabaseTable
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn

class ExampleRepository(private val exampleDao: ExampleDao) {
    fun getAllExampleUnits(): Flow<List<ExampleDatabaseTable>> {
        return exampleDao.getAll().flowOn(Dispatchers.IO)
    }
}
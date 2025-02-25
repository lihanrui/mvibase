package com.illume.mvibase.domain.usecase

import com.illume.mvibase.data.ExampleDatabaseTable
import com.illume.mvibase.domain.ExampleRepository
import kotlinx.coroutines.flow.Flow

class ExampleUseCase(private val repository: ExampleRepository) {
    operator fun invoke(): Flow<List<ExampleDatabaseTable>> = repository.getAllExampleUnits()
}
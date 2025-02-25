package com.illume.mvibase.domain

import com.illume.mvibase.domain.repository.ExampleRepository
import kotlinx.coroutines.flow.Flow

class ExampleUseCase(private val repository: ExampleRepository) {
    operator fun invoke(): Flow<List<ExampleDatabaseTable>> = repository.getAllExampleUnits()
}
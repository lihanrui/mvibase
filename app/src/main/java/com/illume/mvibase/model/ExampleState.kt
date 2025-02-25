package com.illume.mvibase.model

import com.illume.mvibase.domain.ExampleDatabaseTable

data class ExampleState(
    val db_objects: List<ExampleDatabaseTable> = emptyList<ExampleDatabaseTable>(),
    val pos: Int = 0,
    val successDbFetch: Boolean = false,
    val errorMessage: String? = ""
)

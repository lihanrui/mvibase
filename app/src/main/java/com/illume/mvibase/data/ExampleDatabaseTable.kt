package com.illume.mvibase.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "example_table")
data class ExampleDatabaseTable(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,

    /*
     * Add additional data columns:
     */
)
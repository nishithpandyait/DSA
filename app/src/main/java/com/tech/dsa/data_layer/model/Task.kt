package com.tech.dsa.data_layer.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Task(
    @PrimaryKey
    val taskId: Int = 0,
    val taskName: String, var checkbox: Boolean = true,
) {


}
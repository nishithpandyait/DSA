package com.tech.dsa.data_layer.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.tech.dsa.data_layer.model.Task

@Database(entities = [Task::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun taskDao(): TaskDao



}
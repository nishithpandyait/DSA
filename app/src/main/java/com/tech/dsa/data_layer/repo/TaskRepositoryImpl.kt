package com.tech.dsa.data_layer.repo

import com.tech.dsa.data_layer.database.AppDatabase
import javax.inject.Inject

class TaskRepositoryImpl @Inject constructor(val db: AppDatabase) : TaskRepository {


    override suspend fun getAllTask() {
        return db.taskDao().getAllTask()
    }

}
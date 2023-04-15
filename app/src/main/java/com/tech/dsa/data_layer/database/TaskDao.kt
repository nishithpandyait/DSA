package com.tech.dsa.data_layer.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.tech.dsa.data_layer.model.Task

@Dao
interface TaskDao {

    @Insert
    suspend fun insertTask(task: Task)

    @Query("SELECT * FROM task")
    suspend fun getAllTask():

    @Query("SELECT * FROM task where taskId (:id)")
    suspend fun getTask(id: Int)

    @Delete
    suspend fun deleteTask(task: Task)

    //suspend fun updateTask(task: Task)


}
package com.tech.dsa.data_layer.repo

interface TaskRepository  {
    suspend fun getAllTask()
}
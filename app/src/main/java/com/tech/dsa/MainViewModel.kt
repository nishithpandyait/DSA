package com.tech.dsa

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.tech.dsa.data_layer.model.Task
import com.tech.dsa.data_layer.repo.TaskRepositoryImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(val taskRepositoryImpl: TaskRepositoryImpl) : ViewModel() {

    var items by mutableStateOf(
        (1..30).map { i ->
            Task(i, "Hello Task #".plus(i.toString()))
        }
    )

    fun filterData(search: String) {
        // items = items.filter { it.phoneNumber.contentEquals(search) }
        Log.e("->>>", items.size.toString())
    }

    fun getAllTask() {
        taskRepositoryImpl.getAllTask()
    }

    fun insertTask(task: Task){
        taskRepositoryImpl.insertTask(task)
    }

}
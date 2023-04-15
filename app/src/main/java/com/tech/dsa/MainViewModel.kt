package com.tech.dsa

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class MainViewModel:ViewModel() {

    var items by mutableStateOf(
            (1..30).map { i ->
                MainActivity.Phone("Hello Task #".plus(i.toString()))
            }
        )

    fun filterData(search:String){
       // items = items.filter { it.phoneNumber.contentEquals(search) }
        Log.e("->>>",items.size.toString())
    }

}
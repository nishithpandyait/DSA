package com.tech.dsa


import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color


var name = "Hello World"
val uiState = mutableStateOf(name)

@Composable
fun getNameTextView() {
    //recompose not happening
    Column {
        Text(text = name, modifier = Modifier, color = Color.Black)
    }
}

@Composable
fun getNameTextViewWithState() {
    Text(text = uiState.value, modifier = Modifier, color = Color.Black)
    Button(onClick = { uiState.value = "Nishith" }) {
        Text(text = "Click to change name")
    }
}

@Composable
fun getRemberStateTextView(name: String) {//amit
    var extraState by remember {
        mutableStateOf(name)
    }
    Text(text = extraState, modifier = Modifier, color = Color.Black)
    Button(onClick = { extraState = "Nishith" }) {
        Text(text = "Click to change name")
    }
}



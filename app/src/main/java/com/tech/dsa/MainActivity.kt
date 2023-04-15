package com.tech.dsa

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.tech.dsa.data_layer.model.Task
import com.tech.dsa.ui.theme.DSATheme
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val mutableListOf = mutableListOf<String>()
        val toSet = mutableSetOf<String>()
        val str = "STR"
        toSet.add(str)
        toSet.add(str)
        toSet.add(str)
        toSet.add(str)
        toSet.add(str)
        toSet.add(str)
        mutableListOf.add(str)
        mutableListOf.add(str)
        mutableListOf.add(str)

        val viewModel: MainViewModel by viewModels()



        setContent {
            DSATheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    //findGcd()
                    Column {
                        //Text(text = phone.toString())

                        getSearchView() { search ->
                            viewModel.filterData(search = search)
                        }
                        getListView(viewModel) {
                            viewModel.items
                        }
                        FloatingActionButton(onClick = { /*TODO*/ }) {

                        }

                        //  Text(text = toSet.size.toString())
                        /*findBigNumber()
                        findAvg(arrayOf(1f, 2f, 3f, 4f, 5f, 6f, 7f, 8f, 9f, 10f))
                        findFactorial(5)
                        findPelindrome(arrayOf(78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65).toIntArray(), context = this@MainActivity)*/

                        //findBigNumber()
                        //swapTwoNumbers()
                        //   findGCD()
                        //  pelindromeNumber()
                        getNameTextView()
                        getNameTextViewWithState()
                        getRemberStateTextView(name = "Amit")
                    }


                }
            }
        }
    }

    @Composable
    private fun getSearchView(function: (String) -> Unit) {
        var search by remember {
            mutableStateOf("")
        }
        TextField(modifier = Modifier.fillMaxWidth(1f), value = search, onValueChange = {
            search = it
            function.invoke(it)
        })

    }


    @OptIn(ExperimentalMaterialApi::class)
    @Composable
    private fun getListView(viewModel: MainViewModel, function: (mapIndexed: List<Task>) -> Unit) {

        val coroutine = rememberCoroutineScope()


        LazyColumn() {
            items(items.size) { position ->
                Column() {
                    Text(modifier = Modifier.fillMaxSize(1f), text = items[position].taskName)
                    Checkbox(
                        checked = items[position].checkbox,
                        onCheckedChange = {
                            coroutine.launch(Dispatchers.IO) {
                                function(items.mapIndexed { j, item ->
                                    if (j == position) {
                                        item.copy(item.checkbox, item.checkbox.not())
                                    } else {
                                        item
                                    }
                                })
                            }
                        })
                }
            }
        }
    }


}

@Composable
fun Greeting(name: String) {
    Text(fontSize = 30.sp, text = "$name")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    DSATheme {
        Greeting("Android")
    }
}
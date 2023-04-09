package com.tech.dsa

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.tech.dsa.ui.theme.DSATheme

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



        setContent {
            DSATheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background) {
                    //findGcd()
                    Column {
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
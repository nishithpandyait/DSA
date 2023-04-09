package com.tech.dsa

import android.content.Context
import android.content.Intent

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*


@Composable
fun findGcd(a: Int = 10, b: Int = 15) {


    var lcmString: MutableState<String> = remember {
        mutableStateOf("")
    }
    var gcdString: MutableState<String> = remember {
        mutableStateOf("")
    }

    /* TextField(value = gcdString.value, onValueChange = {
         gcdString.value = it
     }, label = { Text(text = "GCD") })

     TextField(value = lcmString.value, onValueChange = {
         lcmString.value = it
     }, label = { Text(text = "LCM") })*/

    Column {
        var i = 1
        var gcd = 0
        val min = if (a < b) a else b
        while (i <= min) {
            if (a % i == 0 && b % i == 0) {
                gcd = i
            }
            i++

        }
        Text(text = "gcd:$gcd")

        var lcm = (a * b) / gcd

        Text(text = "lcm:$lcm")

    }

}


@Composable
fun findBigNumber(a: Int = 300, b: Int = 500, c: Int = 515) {

    Column() {

        val intArray = arrayOf(a, b, c)

        var min = 0
        intArray.forEachIndexed { index, i ->

            min = if (min < i) i else min

        }


        var i = 1
        var gcd = 0
        while (i <= min) {

            if (a % i == 0 && b % i == 0 && c % i == 0) {
                gcd = i
            }

            i++
        }
        Text(text = "GCD:$gcd")
        Text(text = "I:$i")


        var big = if (a > b) a else b

        big = if (big > c) big else c

        Text(text = "BIggest:$big")

    }
}

@Composable
fun findAvg(data: Array<Float>) {
    var sum = 0f

    data.forEachIndexed { index, i ->
        sum += i
    }

    Text(text = "avg=${sum / data.size}")
}

@Composable
fun findFactorial(data: Int) {

    var factor = 1
    var i = data
    while (i > 0) {
        factor = factor * i
        i -= 1
    }
    Text(text = "factor = ${factor}")

}

@Composable
fun findPelindrome(arrayOf: IntArray, context: Context) {


    var treeset = HashMap<String, String>()
    treeset.put("c", "c")
    treeset.put("d", "d")
    treeset.put("a", "a")
    treeset.put("b", "b")
    treeset.put("b", "b")

    treeset.forEach {
        Text(text = it.value)
    }

    Text(text = arrayOf.map { it.toString() }.toString())


    var i = 0

    while (i < arrayOf.size) {

        var j = i
        while (j < arrayOf.size) {

            if (arrayOf[i] > arrayOf[j]) {

                var temp = arrayOf[i]
                arrayOf[i] = arrayOf[j]
                arrayOf[j] = temp
            }

            j++
        }
        i++
    }


    Text(text = arrayOf.map { it.toString() }.toString())


    Button(onClick = {

        val intent: Intent = Intent(context, CameraActivity::class.java)
        context.startActivity(intent)

    }) {
        Text(text = "OPEN CAMERA")
    }

    /*var index = s.length
    var charArray: CharArray = charArrayOf()
    while (index > 0) {
        index -= 1
        charArray[index] = s[index]
    }


    Text(text = "$charArray")*/
}

/**
3. We need the least possible return in which we need to give less currency.
 */
fun getNotes(): Array<Int> {
    return arrayOf(2000, 500, 200, 100, 50, 20, 10, 5, 1)
}

fun main() {

    var billAmount = getCustomerBillAmount()
    var customerPayment = getCustomerPayment()

    val notesToPay = mutableListOf<Int>()
    var remainingReturnPayment = (customerPayment - billAmount)

    while (remainingReturnPayment <= customerPayment) {

        getNotes().forEachIndexed() { index, value ->
            if (value < remainingReturnPayment && value > customerPayment) {
                notesToPay.add(value)
                remainingReturnPayment = remainingReturnPayment - value
            }
        }
    }


    var sum = 0
    notesToPay.forEach() {
        // println("notes to pay $it")
        sum = sum + it
    }
    println(sum)

}

fun getCustomerPayment(): Int {
    return 1000
}

fun getCustomerBillAmount(): Int {
    return 200
}








package com.tech.dsa

import androidx.compose.material.Text
import androidx.compose.runtime.Composable




@Composable
fun findBigNumber() {
    var a = 90000
    var b = 10900
    var c = 4000

    var bigNo = 0

    if (a > b) {
        bigNo = a
    } else {
        bigNo = b
    }
    if (c > bigNo) {
        bigNo = c
    }

    println(bigNo)

    //  Text(text = bigNo.toString())

}

fun main(){

}


@Composable
fun findGCD() {

    var a = 10
    var b = 20

    var i = 1

    var smallest = if (a < b) b else a
    var gcd = 0

    while (i <= smallest) {
        if (a % i == 0 && b % i == 0) {
            gcd = i
        }
        i++
    }

    var lcm = (a * b) / gcd
    Text(text = "gcd:$gcd")
    Text(text = "lcm:$lcm")

    mutableListOf<String>()

}

@Composable
fun pelindromeNumber() {

    var x = 100001
    var rem = 0
    var reverseNumber = 0
    var originalNumber = x

    while (x != 0) {
        rem = x % 10
        reverseNumber = reverseNumber * 10 + rem
        x /= 10
    }

    Text(text = (reverseNumber == originalNumber).toString())


}

@Composable
fun swapTwoNumbers() {
    var a = 10
    var b = 20

    Text(text = a.toString())
    Text(text = b.toString())

    var temp = a
    a = b
    b = temp


    Text(text = a.toString())
    Text(text = b.toString())
}





package com.tech.dsa

import com.tech.dsa.playground.knight.BraveKnight
import com.tech.dsa.playground.quest.DamselRescuingQuest
import com.tech.dsa.playground.quest.DragonSlayQuest
import org.junit.Test
import org.w3c.dom.Text

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun testDamselRescuingKnight() {
        val damselRescuingKnight = BraveKnight()
        damselRescuingKnight.performQuestDuty(DamselRescuingQuest())
        damselRescuingKnight.performQuestDuty(DragonSlayQuest())
    }

    @Test
    fun testGCD() {
        var a = 10
        var b = 20
        var gcd = 0
        var i = 1
        var min = if (a < b) a else b
        while (i <= min) {
            if (a % i == 0 && b % i == 0)
                gcd = i
            i++
        }
        println("gcd:" + gcd)
        println("lcm:" + (a * b) / gcd)
    }

    @Test
    fun testPelindrome() {
        var x = 3030
        var reminder = 0
        var reverseNumber = 0
        var originalNumber = x

        while (x != 0) {
            reminder = x % 10
            reverseNumber = reverseNumber * 10 + reminder
            x = x / 10
        }
        var boolean = reverseNumber == originalNumber
        println(boolean)

    }

    @Test
    fun printPattrn1() {
        var i = 5
        while (i >= 0) {
            var j = i
            while (j >= 0) {
                print(i)
                j--
            }
            println()
            i--
        }
    }


    @Test
    fun findLargest() {
        var array = intArrayOf(200, 15, 300, 20, 50, 100)
        var temp = 0
        array.forEachIndexed() { i, _ ->
            array.forEachIndexed() { j, _ ->
                if (array[i] > array[j]) {
                    temp = array[i]
                    array[i] = array[j]
                    array[j] = temp
                }
            }
        }

        array.forEach {
            print(it.toString() + ",")
        }

    }


}
package com.serzh.my

import java.io.BufferedReader
import java.io.StringReader

fun main(args: Array<String>) {
    val number = 5
    if (number !in 0..100) {
        throw IllegalArgumentException("A percentage value must be between 0 and 100: $number")
    }

    val percentage =
            if (number in 0..100)
                number
            else
                throw IllegalArgumentException("A percentage value must be between 0 and 100: $number")

    fun readNumber(reader: BufferedReader): Int? {
        try {
            val line = reader.readLine()
            return Integer.parseInt(line)
        } catch (e: NumberFormatException) {
            return null
        } finally {
            reader.close()
        }
    }

    val reader = BufferedReader(StringReader("239"))
    println(readNumber(reader)) // 239

    fun readNumber2(reader: BufferedReader) {
        val number = try {
            Integer.parseInt(reader.readLine())
        } catch (e: NumberFormatException) {
            return
        }
        println(number)
    }

    val reader21 = BufferedReader(StringReader("not a number"))
    readNumber2(reader21) //
    val reader22 = BufferedReader(StringReader("34"))
    readNumber2(reader22) // 34

    fun readNumber3(reader: BufferedReader) {
        val number = try {
            Integer.parseInt(reader.readLine())
        } catch (e: NumberFormatException) {
            null
        }
        println(number)
    }

    val reader31 = BufferedReader(StringReader("not a number"))
    readNumber3(reader31) // null


}
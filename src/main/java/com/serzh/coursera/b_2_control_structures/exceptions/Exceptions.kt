package com.serzh.example.coursera.b_2_control_structures.exceptions

import java.io.IOException

//    @Throws annotation
@Throws(IOException::class)
fun foo() {
    throw IOException()
}

fun foo2() {
    throw IOException()
}

//No difference between checked and unchecked exceptions

//  throw is an expression
fun main(args: Array<String>) {
    val number = 0
    val percentage =
            if (number in 0..100)
                number
            else
                throw IllegalArgumentException(
                        "A percentage value must be" +
                                "between 0 and 100: $number")

    val string = ""

//    try is an expression

    val number2 = try {
        Integer.parseInt(string)
    } catch (e: NumberFormatException) {
        return
    }

    val number3 = try {
        Integer.parseInt(string)
    } catch (e: NumberFormatException) {
        null
    }

    println()








}
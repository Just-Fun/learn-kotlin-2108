package com.serzh.example.coursera.b_2_extenion.b_2_1_extension_functions

//Change the 'sum' function so that it was declared as an extension to List<Int>.
fun sumOld(list: List<Int>): Int {
    var result = 0
    for (i in list) {
        result += i
    }
    return result
}

fun List<Int>.sum() : Int {
    var result = 0
    for (i in this) {
        result += i
    }
    return result
}

fun main(args: Array<String>) {
//    val sum = sumOld(listOf(1, 2, 3))
    val sum = listOf(1, 2, 3).sum()
    println(sum)    // 6
}
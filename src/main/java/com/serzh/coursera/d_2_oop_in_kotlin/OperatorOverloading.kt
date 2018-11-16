package com.serzh.coursera.d_2_oop_in_kotlin

fun main(args: Array<String>) {
    var list = listOf(1, 2, 3)
    list += 5
    println(list)
//    [1, 2, 3, 5]

    var newList = list + 2
    println(newList)
//    [1, 2, 3, 5, 2]

    var newList2 = newList
    newList2 += 6

    println(newList)
//    [1, 2, 3, 5, 2]
    println(newList2)
//    [1, 2, 3, 5, 2, 6]

    val mutableList = mutableListOf(1, 2, 3)
    mutableList += 4

    println(mutableList)
//    [1, 2, 3, 4]
}
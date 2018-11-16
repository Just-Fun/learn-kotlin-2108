package com.serzh.coursera.e_2_sequences

fun main(args: Array<String>) {
    val list = listOf(1, 2, -3)
    val map = list.map { it * it }
    println(map)  // [1, 4, 9]


    val filter = listOf(1, 2, -3)
            .map { it * it }
            .filter { it % 2 == 1 }

    val filter1 = listOf(1, 2, -3)
            .asSequence()
            .map { it * it }
            .filter { it % 2 == 1 }

}
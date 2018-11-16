package com.serzh.coursera.e_2_sequences

fun fibonacci(): Sequence<Int> = sequence {
    var elements = Pair(0, 1)

    while (true) {
        yield(elements.first)
        elements = Pair(elements.second, elements.first + elements.second)
    }
}

fun main(args: Array<String>) {
    val take1 = fibonacci().take(0).toList().toString()
    println(take1)
//    []

    val take4 = fibonacci().take(4).toList().toString()
    println(take4)
//    eq            "[0, 1, 1, 2]"

    val take10 = fibonacci().take(10).toList().toString()
    println(take10)
//    eq            "[0, 1, 1, 2, 3, 5, 8, 13, 21, 34]"
}
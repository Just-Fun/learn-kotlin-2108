package com.serzh.coursera.e_2_sequences

fun m(i: Int): Int {
    print("m$i ")
    return i
}

fun f(i: Int): Boolean {
    print("f$i ")
    return i % 2 == 0
}

fun main(args: Array<String>) {

    val list = listOf(1, 2, 3, 4)
    list.map(::m).filter(::f) // m1 m2 m3 m4 f1 f2 f3 f4

    println("---------")

    list.asSequence().map(::m).filter(::f).toList() //m1 f1 m2 f2 m3 f3 m4 f4?

    println("---------")

    list.asSequence().map(::m).filter(::f) // (nothing is printed)

    println("---------")

    list.asSequence().map(::m).filter(::f).max() // m1 f1 m2 f2 m3 f3 m4 f4

    println("---------")

}

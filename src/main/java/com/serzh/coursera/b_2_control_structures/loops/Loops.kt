package com.serzh.example.coursera.b_2_control_structures.loops


fun main(args: Array<String>) {
    val condition = true
    while (condition) {
        /*...*/
    }

    val list = listOf("a", "b", "c")
    for (s in list) {
        print(s)
    }

    val list2 = listOf("a", "b", "c")
    for (s: String in list2) {
        print(s)
    }

    val map = mapOf(1 to "one",
            2 to "two",
            3 to "three")
    for ((key, value) in map) {
        println("$key = $value")
    }
//    1 = one
//    2 = two
//    3 = three

    val list3 = listOf("a", "b", "c")
    for ((index, element) in list3.withIndex()) {
        println("$index: $element")
    }
//    0: a
//    1: b
//    2: c

//    including upper bound
    for (i in 1..9) {
        print(i)
    }

//    excluding upper bound
    for (i in 1 until 10) {
        print(i)
    }

    for (i in 9 downTo 1 step 2) {
        print(i)
    }

    for (ch in "abc") {
        print(ch + 1)
    }
//    bcd
}


package com.serzh.my

fun main(args: Array<String>) {
    val arrayOfStrings: List<String> = listOf("first", "second", "fourteenth")
    val last = arrayOfStrings.last() // fourteenth
    println(last)

    val array: Array<String> = arrayOf("one", "two")
    val list = listOf("zero", *array) // [zero, one, two]
    println(list)

    val numbers: Collection<Int> = setOf(1, 14, 2)
    val max = numbers.max() // 14
    println(max)


    val (number, name) = 1.to("one")
//    or
    val (number2, name2) = 1 to "one"

    val pair = 1.to("one")
//    or
    val pair2 = 1 to "one"

    println(pair)   // (1, one)
    println(pair2)  // (1, one)

    for ((index, element) in list.withIndex()) {
        print("$index: $element ") // 0: zero 1: one 2: two
    }

    val map = mapOf(1 to "one", 7 to "seven", 53 to "fifty-three")
//    fun <К, V> mapOf(vararg values: PaircK, V>): Map<K, V>
}

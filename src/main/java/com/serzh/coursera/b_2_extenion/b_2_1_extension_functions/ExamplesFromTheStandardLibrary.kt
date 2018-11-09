package com.serzh.example.coursera.b_2_extenion.b_2_1_extension_functions

fun main(args: Array<String>) {

    val set = hashSetOf(1, 7, 53)
    val list = arrayListOf(1, 7, 53)
    val map = hashMapOf(1 to "one",
            7 to "seven", 53 to "fifty-three")

    println(set.javaClass)  // class java.util.HashSet
    println(list.javaClass) // class java.util.ArrayList
    println(map.javaClass)  // class java.util.HashMap


    println(listOf('a', 'b', 'c').joinToString(
            separator = ""
            , prefix = "(", postfix = ")"))
//            (abc)
/*
    fun <T> Iterable<T>.joinToString(
            separator: CharSequence = ", ",
            prefix: CharSequence = ""
            ,
            postfix: CharSequence = ""
    ): String
*/

    println("Hello, ${args.getOrNull(0)}!")
//    fun <T> Array<T>.getOrNull(index: Int) =
//            if (index in 0 until size) this[index] else null

    val list2 = listOf("abc")
    println(list2.getOrNull(0)) // abc
    println(list2.getOrNull(1)) // null
//    fun <T> List<T>.getOrNull(index: Int) =
//            if (index in 0 until size) this[index] else null


//    Extension function: withIndex()
    val list3 = listOf("a", "b", "c")
    for ((index, element) in list3.withIndex()) {
        println("$index $element")
    }
//    fun <T> Iterable<T>.withIndex(): List<IndexedValue<T>> { … }


//    infix fun <A, B> A.to(that: B) = Pair(this, that)
    "ANSWER".to(42)
    "hot" to "RED"

    mapOf(0 to "zero", 1 to "one")


    //    Extension functions on Char
    fun Char.isLetter() = this in 'a'..'z' || this in 'A'..'Z'

    fun Char.isLetterOrDigit() = isLetter() || this in '0'..'9'

    'a'.isLetter() // true
    '%'.isLetterOrDigit() // false

    val regex = "\\d{2}\\.\\d{2}\\.\\d{4}".toRegex()
    val regex2 = """\d{2}\.\d{2}\.\d{4}""".toRegex()
    regex.matches("15.02.2016") // true
    regex.matches("15.02.16") // false

    "123".toInt() // 123
    "1e-10".toDouble() // 1.0E-10
    "xx".toInt() // NumberFormatException
    "123".toIntOrNull() // 123
    "xx".toIntOrNull() // null

    infix fun <T> T.eq(other: T) {
        if (this == other) println("OK")
        else println("Error: $this != $other")
    }

    fun getAnswer() = 42
    getAnswer() eq 42 // OK
    getAnswer() eq 43 // Error: 42 != 43


    //    What is the type of 'a' to 1.0?
    infix fun <A, B> A.to(that: B): Pair<A, B> = Pair(this, that)

    data class Pair<A, B>(val first: A, val second: B) {
        override fun toString(): String = "($first, $second)"
    }


}
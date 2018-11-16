@file:JvmName("CollectionsFunctions")

// now call from Java "CollectionsFunctions.joinToString(..."
package com.serzh.my

//static, but call from java using getter - "int opCount= CollectionsFunctions.getOpCount();"
var opCount = 0
val UNIX_LINE_SEPARATOR = "\n"
public const val UNIX_LINE_SEPARATOR2 = "\n" // = public static final String UNIX_LINE_SEPARATOR = "\n";

fun performOperation() {
    opCount++
}

fun reportOperationCount() {
    println("Operation performed $opCount times")
}

fun main(args: Array<String>) {
    val list = listOf(1, 7, 53)
    val arrayList = arrayListOf(1, 7, 53)
    val set = setOf(1, 7, 53)
    val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

    println(list.javaClass)      // class java.util.Arrays$ArrayList
    println(arrayList.javaClass) // class java.util.ArrayList
    println(set.javaClass)       // class java.util.LinkedHashSet
    println(map.javaClass)       // class java.util.HashMap

    val strings = listOf("first", "second", "fourteenth")
    println(strings.last()) // fourteenth

    val numbers = setOf(1, 14, 2)
    println(numbers.max()) // 14

    println(list) // [1, 7, 53]

    joinToStringOld(list)

    performOperation()
    reportOperationCount() // Operation performed 1 times

//    println(list.joinToStringNew(separator = "; ", prefix = "(", postfix = ")"))
    println(listOf("1", "2", "3").joinToStringNew(separator = "; ", prefix = "(", postfix = ")")) // (1; 2; 3)

}

fun Collection<String>.joinToStringNew(
        separator: String = ", ",
        prefix: String = "",
        postfix: String = ""
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

fun <T> joinToStringOld(collection: Collection<T>,
                        separator: String = ", ",
                        prefix: String = "",
                        postfix: String = ""
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

package com.serzh.example.coursera.b_2_extenion.b_2_1_extension_functions

fun main(args: Array<String>) {
    val c: Char = "abc".lastChar()
    val c2: Char = "abc".lastChar2()
    println()
}

fun String.lastChar() = this.get(this.length - 1)
fun String.lastChar2() = get(this.length - 1)

fun String.repeat(n: Int): String {
    val sb = StringBuilder(n * length)
    for (i in 1..n) {
        sb.append(this)
    }
    return sb.toString()
}
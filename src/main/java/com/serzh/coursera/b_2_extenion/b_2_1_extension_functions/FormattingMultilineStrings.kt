package com.serzh.example.coursera.b_2_extenion.b_2_1_extension_functions

fun main(args: Array<String>) {
    val q = """To code,
 |or not to code?..""".trimMargin()
    println(q)
//    To code,
//    or not to code?..

    val q2 = """To code,
 #or not to code?..""".trimMargin(marginPrefix = "#")
    println(q2)
//    To code,
//    or not to code?..

    val q3 = """To code,
 |or not to code?..""".trimMargin()
    val a = """
 Keep calm
 and learn Kotlin""".trimIndent()
    println(q3)
//    To code,
//    or not to code?..
    println(a)
//    Keep calm
//    and learn Kotlin

}
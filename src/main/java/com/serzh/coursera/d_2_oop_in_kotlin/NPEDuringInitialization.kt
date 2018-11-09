package com.serzh.example.coursera.d_2_oop_in_kotlin

//open class A(open val value: String) {
open class A(value: String) {
    init {
        value.length
    }
}

//class B(override val value: String) : A(value)
class B(value: String) : A(value)

fun main(args: Array<String>) {
    B("a")
}
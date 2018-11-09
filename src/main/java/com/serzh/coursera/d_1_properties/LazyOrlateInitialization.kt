package com.serzh.example.coursera.d_1_properties

val lazyValue: String by lazy {
    println("lazyValue computed!")
    "Hello lazyValue"
}

val value: String
    get() {
        println("value computed!")
        return "value Hello"
    }

fun main(args: Array<String>) {
    println("Start")
    println(lazyValue)
    println(lazyValue)
    println(value)
    println(value)
}

//computed!
//Hello
//Hello
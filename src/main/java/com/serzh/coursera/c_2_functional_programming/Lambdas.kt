package com.serzh.example.coursera.c_2_functional_programming

fun main(args: Array<String>) {
    val list = listOf<Int>()

//    full syntax
    list.any({ i: Int -> i > 0 })

//    when lambda is the last argument, it can be moved out of parentheses
    list.any() { i: Int -> i > 0 }

//    empty parentheses can be omitted
    list.any { i: Int -> i > 0 }

//    type can be omitted if it’s clear from the context
    list.any { i -> i > 0 }

//    it denotes the argument if it’s only one
    list.any { it > 0 }

//    Multi-line lambda
    list.any {
        println("processing $it")
        it > 0
    }
//    the last expression is the result

    val map = mapOf<String, Int>()

//    use destructuring declarations syntax instead
    map.mapValues { entry -> "${entry.key} -> ${entry.value}!" }

//    destructuring declarations syntax
    map.mapValues { (key, value) -> "$key -> $value!" }

//    omit the parameter name if the parameter is unused
    map.mapValues { (_, value) -> "$value!" }
}
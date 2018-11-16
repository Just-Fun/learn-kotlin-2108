package com.serzh.coursera.e_2_sequences

fun main(args: Array<String>) {

    val numbers = generateSequence(3) {
        n ->
        println("Generating element…")
        (n + 1).takeIf { it < 7 }
    }
    println(numbers.first()) // 3
    println(numbers.toList())

/*    generateSequence { Random.nextInt() }

    val seq = generateSequence {
        Random.nextInt(5).takeIf { it > 0 }
    }
    val message = seq.toList()
    println(message)*/
}
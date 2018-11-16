package com.serzh.my

import java.util.*

fun main(args: Array<String>) {
    for (i in 1..10) {
        print(fizzBuzz(i)) //Si Si Fizz Si Buzz Fizz Si Si Fizz Buzz
    }
    println()

    for (i in 10 downTo 1 step 2) {
        print(fizzBuzz(i)) //Buzz Si Fizz Si Si
    }
    println()

    val binaryReps = TreeMap<Char, String>() //О—СловарьТгееМархранкгключивпорядкесортировки
    for (c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binary // эквивалентен следующему коду на Java: binaryReps.put(c, binary)
    }

    for ((letter, binary) in binaryReps) {
        print("$letter = $binary  ") // A = 1000001  B = 1000010  C = 1000011  D = 1000100  E = 1000101  F = 1000110
    }
    println()

    val list = arrayListOf("10", "И", "1001")
    for ((index, element) in list.withIndex()) {
        print("$index: $element  ") // 0: 10  1: И  2: 1001
    }

//    Проверка вхождения в диапазон с помощью in
    fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
//    с in 'а'..' z’ — Преобразуется в а<=с&&с<=z
    fun isNotDigit(c: Char) = c !in '0'..'9'

    println(isLetter('q'))   // true
    println(isNotDigit('x')) // true

    fun recognize(c: Char) = when (c) {
        in '0'..'9' -> "It's a digit!"
        in 'a'.. 'z', in 'A'..'Z' -> "It's a letter!"
        else -> "I don't know..1"
    }

    println(recognize('8')) // It's a digit!

    println("Kotlin" in "Java".."Scala")        // true

    println("Kotlin" in setOf("Dava", "Scala")) // false


}


fun fizzBuzz(i: Int) = when {
    i % 15 == 0 -> "FizzBuzz"
    i % 3 == 0 -> "Fizz "
    i % 5 == 0 -> "Buzz "
    else -> "Si "
}

interface Expr

class Num(val value: Int) : Expr

class Sum(val left: Expr, val right: Expr) : Expr

fun evalIf(e: Expr): Int {
    if (e is Num) {
        val n = e as Num
        return n.value
    }

    if (e is Sum) {
        return evalIf(e.right) + evalIf(e.left)
    }
    throw IllegalArgumentException("Unknown expression")
}

fun evalWhen(e: Expr): Int = when (e) {
    is Num -> e.value
    is Sum ->
        evalWhen(e.right) + evalWhen(e.left)
    else ->
        throw IllegalArgumentException("Unknown expression")
}

fun evalWithLogging(e: Expr): Int = when (e) {
    is Num -> {
        println("num : ${e.value}")
        e.value
    }
    is Sum -> {
        val left = evalWithLogging(e.left)
        val right = evalWithLogging(e.right)
        println("sum: Sleft+Jright")
        left + right
    }
    else -> throw IllegalArgumentException("Unknown expression")
}

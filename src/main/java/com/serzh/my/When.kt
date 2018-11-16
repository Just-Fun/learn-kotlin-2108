package com.serzh.my

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
package com.serzh.my.classes_objects_interfaces

interface Expr1
class Num(val value: Int) : Expr1
class Sum(val left: Expr1, val right: Expr1) : Expr1

fun eval(e: Expr1): Int = when (e) {
    is Num -> e.value
    is Sum -> eval(e.right) + eval(e.left)
    else ->
        throw IllegalArgumentException("Unknown expression")
}

sealed class Expr {
    class Num(val value: Int) : Expr()
    class Sum(val left: Expr, val right: Expr) : Expr()

    fun eval(e: Expr): Int =
            when (e) {
                is Expr.Num -> e.value
                is Expr.Sum -> eval(e.right) + eval(e.left)
                // don't need else block
            }
}
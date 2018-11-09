package com.serzh.example.coursera.b_2_control_structures.if_when

import com.serzh.example.coursera.b_2_control_structures.if_when.Color.BLUE
import com.serzh.example.coursera.b_2_control_structures.if_when.Color.ORANGE
/*
fun main(args: Array<String>) {
    updateWeather(5)
}
*/

enum class Color {
    BLUE, ORANGE, RED, YELLOW, GREEN, INDIGO, VIOLET
}

fun getWarmth(color: Color): String =
        when (color) {
            BLUE -> "cold"
            ORANGE -> "mild"
            Color.RED -> "hot"
            else -> "other"
        }

fun whenSyntax(a: Any) = when (a) {
    0, 1 -> "is zero or one"
    is Boolean -> "is boolean"
    is String -> "is string of length ${a.length}"
    else -> "other"
}

//Any expression can be an argument

fun mix(c1: Color, c2: Color) =
        when (setOf(c1, c2)) {
            setOf(Color.RED, Color.YELLOW) -> Color.ORANGE
            setOf(Color.YELLOW, Color.BLUE) -> Color.GREEN
            setOf(Color.BLUE, Color.VIOLET) -> Color.INDIGO
            else -> throw Exception("Dirty color")
        }

//the argument is checked for equality with the branch conditions

fun updateWeather(degrees: Int) {
    val (description, colour) = when {
        degrees < 5 -> "cold" to Color.BLUE
        degrees < 23 -> "mild" to Color.ORANGE
        else -> "hot" to Color.RED
    }
}
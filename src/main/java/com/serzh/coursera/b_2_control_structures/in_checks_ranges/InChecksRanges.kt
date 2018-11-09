package com.serzh.example.coursera.b_2_control_structures.in_checks_ranges

fun main(args: Array<String>) {
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false
}

fun isValidIdentifier(s: String): Boolean {
    fun isValidCharacter(ch: Char) = ch == '_' || ch.isLetterOrDigit()

    if (s.isEmpty() || s[0].isDigit()) return false

    for (c in s) {
        if (!isValidCharacter(c)) return false
    }

    return true

    /*return s.isNotEmpty()
            && (s.startsWith("_") || isLetter(s.substring(0, 1)))
            && isValidCharacters(s)*/
}

fun isLetter(c: String) = c in "a".."z" || c in "A".."Z"

fun isValidCharacters(s: String): Boolean {
    for (c: Char in s) {
        if (!(c in 'a'..'z' || c in 'A'..'Z' || c in '0'..'9' || c == '_')) {
            return false
        }
    }
    return true
}


fun main2() {
//in: two use-cases
//    iteration
    for (i in 'a'..'z') {
//        …
    }

//    check for belonging
//    c in 'a'..'z'

    fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
    isLetter('q') // true
    isLetter('*') // false

//    c in 'a'..'z'
//    is compiled to
//    'a' <= c && c <= 'z'

    //    not in a range
    fun isNotDigit(c: Char) = c !in '0'..'9'
    isNotDigit('x') // true

    fun recognize(c: Char) = when (c) {
        in '0'..'9' -> "It's a digit!"
        in 'a'..'z', in 'A'..'Z' -> "It's a letter!"
        else -> "I don't know…"
    }

    recognize('$') // I don't know

    1..9        // IntRange
    1 until 10  // IntRange
    'a'..'z'    // CharRange
    "ab".."az"  // ClosedRange<String>


}



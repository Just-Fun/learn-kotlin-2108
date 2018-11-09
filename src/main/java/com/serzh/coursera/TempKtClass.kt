package com.serzh.example.coursera

fun main(args: Array<String>) {

//    val message = listOf(1, 2, 3).joinToString(postfix = ".")
    val message = listOf(1, 2, 3).joinToString()
    println(message)

    foo()

}

fun displaySeparator(character: Char = '*', size: Int = 10) {
    repeat(size) {
        print(character)
    }
}

@JvmOverloads
fun displaySeparatorForJavaDefaultArgs(character: Char = '*', size: Int = 10) {
    repeat(size) {
        print(character)
    }
}


fun max(a: Int, b: Int): Int = 1

fun m2(args: Array<String>) = {

    var s = 1
//    s = "2"


    val name =
            if (args.isNotEmpty())
                args[0]
            else
                "Kotlin"
}
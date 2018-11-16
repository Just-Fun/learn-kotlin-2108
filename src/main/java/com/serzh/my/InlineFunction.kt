package com.serzh.my

fun main(args: Array<String>) {
    println("Kotlin".lastChar3()) // n
    val с = "Kotlin".lastChar1()
//    call from Java - "char lastChar1 = InlineFunctionKt.lastChar1("Java");"
}

fun String.lastChar0(): Char = this.get(this.length - 1)
fun String.lastChar1(): Char = get(this.length - 1)
fun String.lastChar2(): Char = this[this.length - 1]
fun String.lastChar3(): Char = this[length - 1]

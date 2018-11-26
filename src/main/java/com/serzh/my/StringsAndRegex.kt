package com.serzh.my

fun main(args: Array<String>) {

    println("12.345-6.А".split("\\.|-".toRegex()))
//    [12, 345, 6, А]

    println("12.345-6.A".split(".", "-"))
//    [12, 345, 6, А]

    parsePath("/Users/yole/kotlin-book/chapter.adoc")      // Dir: /Users/yole/kotlin-book, name: chapter, ext: adoc
    parsePathRegex("/Users/yole/kotlin-book/chapter.adoc") // Dir: /Users/yole/kotlin-book, name: chapter, ext: adoc


    val kotlinLogo = """| //
                        .|//
                        .|/\"""

    println(kotlinLogo.trimMargin("."))
//    | //
//    |//
//    |/\

    val price = """${'$'}99.9""" // $99.9
    println(price)

    val check = "check"

    val s = """$check""" // check
    println(s)

}

fun parsePath(path: String) {
    val directory = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")
    val fileName = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")
    println("Dir: $directory, name: $fileName, ext: $extension")
}

fun parsePathRegex(path: String) {
    val regex = """(.+)/(.+)\.(.+)""".toRegex()
    val matchResult = regex.matchEntire(path)
    if (matchResult != null) {
        val (directory, filename, extension) = matchResult.destructured
        println("Dir: $directory, name: $filename, ext: $extension")
    }
}
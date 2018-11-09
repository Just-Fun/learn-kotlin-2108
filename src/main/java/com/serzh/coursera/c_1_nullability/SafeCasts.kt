package com.serzh.example.coursera.c_1_nullability

fun main(args: Array<String>) {

    var any = ""
//    is = instanceof
    if (any is String) {
        val s = any as String // not necessary
        s.toUpperCase()
    }



    if (any is String) {
        any.toUpperCase() // smart cast
    }
//    ->
    (any as? String)?.toUpperCase()

//    Safe cast: as?
//    returns null if expression cannot be cast
    var a = ""
    val s2 = if (a is String) a else null
    val s3: String? = a as? String

    var s= null
    println(s as? Int) // null

    var s1= null
    println(s1 as Int?) // null

    var s0= ""
    println(s0 as? Int) // null

    var s11= ""
    println(s11 as Int?) // java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer

}
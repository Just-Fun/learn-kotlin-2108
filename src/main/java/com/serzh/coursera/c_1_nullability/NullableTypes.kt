package com.serzh.example.coursera.c_1_nullability

fun main(args: Array<String>) {

//    val s1: String = null ✗
    val s2: String = "always not null"
    val s3: String? = null
    val s4: String? = "can be null or non-null"

    s2.length // ✓
//    s3.length ✗


    val s: String? = ""
    if (s != null) {
        s.length
    }

    s?.length

    val s5: String? = ""
    val s6: String? = null

    val length5 = s5?.length // 0
    val length6 = s6?.length // null

    val s7: String? = ""
    val length7 = if (s7 != null) s7.length else null
//    ->
    val length8 = s7?.length

    val length9: Int? = s7?.length

//    Nullability operators
    val length10: Int = if (s != null) s.length else 0

    val length11: Int = s?.length ?: 0

//    Control-flow analysis
    val s8: String? = ""
//    s8.length
//    if (s8 == null)  fail()
//    smart cast

    if (s == null) return
    //    smart cast
    s.length

//    Making NPE explicit
    val s9: String? = null
    s9!! // throws NPE if s is null
    s9!!.length




}

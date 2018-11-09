package com.serzh.example.coursera.c_1_nullability

fun main(args: Array<String>) {
    val s1: String? = null
    val s2: String? = ""
/*    s1.isEmptyOrNull() eq true
    s2.isEmptyOrNull() eq true

    val s3 = "   "
    s3.isEmptyOrNull() eq false*/
    val nullOrEmpty = s1.isNullOrEmpty()
    val nullOrBlank = s1.isNullOrBlank()
}

fun isEmptyOrNullOld(s : String?) = s == null || s.isEmpty()

fun String?.isEmptyOrNull1() = this == null || isEmpty()

fun String?.isEmptyOrNull(): Boolean {
 return this == null || this.length == 0
}

fun String?.isEmptyOrNull2(): Boolean {
    return this == null || this.isEmpty()
}

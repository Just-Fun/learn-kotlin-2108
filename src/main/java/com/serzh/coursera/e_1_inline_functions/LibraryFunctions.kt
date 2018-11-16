package com.serzh.coursera.e_1_inline_functions

import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock
import kotlin.concurrent.withLock


fun main(args: Array<String>) {

    fun getEmail(): Email? {
        return Email("a@g.com")
    }

    val email = getEmail()
    if (email != null) sendEmailTo(email)

    email?.let { e -> sendEmailTo(e) }

    email?.let { sendEmailTo(it) }

    getEmail()?.let { sendEmailTo(it) }

//    Error: Type mismatch: inferred type is Email? but Email was expected
//    getEmail().let { sendEmailTo(it) }

    val number = 42
    val takeIf1 = number.takeIf { it > 10 } // 42
    val other = 2
    val takeIf2 = other.takeIf { it > 10 } // null

    val l:Lock = ReentrantLock();
    l.withLock() {
        println("")
    }

}

fun sendEmailTo(email: Email) {
    println(email)
}

data class Email(var email: String)

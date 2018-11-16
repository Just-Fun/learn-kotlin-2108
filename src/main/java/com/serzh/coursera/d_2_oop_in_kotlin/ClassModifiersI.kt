package com.serzh.coursera.d_2_oop_in_kotlin

data class Contact(val name: String, val address: String)

fun main(args: Array<String>) {
    val contact = Contact("Ron", "address 1")

    val copy = contact.copy()
    val copyNewAddress = contact.copy(address = "new address")

    println()
    println()

}

package com.serzh.my

//https://proandroiddev.com/writing-dsls-in-kotlin-part-2-cd9dcd0c4715
fun main(args: Array<String>) {
    val person = person {
        name = "John"
        age = 25
        address {
            street = "Main Street"
            number = 42
            city = "London"
        }
    }
    println(person)
}

data class Person(var name: String? = null,
                  var age: Int? = null,
                  var address: Address? = null)

data class Address(var street: String? = null,
                   var number: Int? = null,
                   var city: String? = null)

fun person(block: Person.() -> Unit): Person = Person().apply(block)

fun Person.address(block: Address.() -> Unit) {
    address = Address().apply(block)
}
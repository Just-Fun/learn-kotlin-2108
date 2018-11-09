package com.serzh.example.coursera.d_1_properties

import kotlin.random.Random

var counter: Int = 1

val foo: Int
    /*   get() {
            counter +=1
            return counter
        }*/
//    get() = counter++
//    get() = Random.nextInt()
    get(): Int = Random.nextInt()

fun main(args: Array<String>) {
    // The values should be different:
    println(foo)
    println(foo)
    println(foo)
}
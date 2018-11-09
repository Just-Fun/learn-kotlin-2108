package com.serzh.example.coursera.b_2_extenion.b_2_1_extension_functions

fun main(args: Array<String>) {
    val parent: Parent = Child()
    println(parent.foo())
//    parent
}

open class Parent
class Child : Parent()
//Child -> Parent

fun Parent.foo() = "parent"
fun Child.foo() = "child"

//Extensions are static Java functions under the hood
//No override for extension functions in Kotlin

//The analogous code in Java
/*
public static String foo(Parent parent) { return "parent"; }

public static String foo(Child child) { return "child"; }

public static void main(String[] args) {
    Parent parent = new Child();
    System.out.println(foo(parent));
}
*/

//Member vs extension
fun String.get(index: Int) = '*'

fun main2(args: Array<String>) {
    println("abc".get(1))
//    b
}

//Extensions don’t hide members
class A {
    fun foo() = 1
    fun fooS() = "member"
}

//Warning: Extension is shadowed by a member
fun A.foo() = 2

//But extensions can overload members
fun A.foo(i: Int) = "extension($i)"

fun main3(args: Array<String>) {
    A().foo() // 1
    A().foo(2) // extension(2)
}


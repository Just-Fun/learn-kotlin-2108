package com.serzh.my.classes_objects_interfaces


fun main(args: Array<String>) {
    val alice = User4("Alice")
    println(alice.isSubscribed) // true

    val bob = User4("Bob", false)
    println(bob.isSubscribed) // false

    val carol = User4("Carol", isSubscribed = false)
    println(carol.isSubscribed) // false
}

open class User(val nickname: String) {}
class TwitterUser(nickname: String) : User(nickname) {}

open class Button5
class RadioButton : Button5()

class Secretive private constructor() {} // Конструкторэтого классаприватный

open class View5 {
    constructor(ctx: String) {
// некоторый код
    }

    constructor(ctx: String, attr: List<String>) {
        // некоторый код
    }
}

class MyButton : View5 {
    constructor(ctx: String)
            : super(ctx) {
    }

    constructor(ctx: String, attr: List<String>)
            : super(ctx, attr) {
    }
}

class MyButton2 : View5 {
    constructor(ctx: String) : this(ctx, listOf<String>("sd")) {}

    constructor(ctx: String, attr: List<String>) : super(ctx, attr) {
    }
}


class User1 constructor(_nickname: String) {
    val nickname: String

    init {
        nickname = _nickname
    }
}

class User2(_nickname: String) {
    val nickname = _nickname
}

class User3(val nickname: String)

class User4(val nickname: String,
            val isSubscribed: Boolean = true)
package com.serzh.my.classes_objects_interfaces


fun main(args: Array<String>) {
    println(PrivateUser("test@kotlinlang.org").nickname)
//    testgkotlinlang.org
    println(SubscribingUser("test@kotlinlang.org").nickname)
//    test

    val user44 = User44("Vasia")
    user44.address = "Boichenko"
//    Address was changed for Vasia:
//    "unspecified" -> "Boichenko
}

interface User22 {
    val nickname: String
}

class PrivateUser(override val nickname: String) : User22 // Свойство основного конструктора


class SubscribingUser(val email: String) : User22 {
    override val nickname: String
        get() = email.substringBefore('@') //Собственный метод чтения
}

class FacebookUser(val accountld: Int) : User22 {
    override val nickname = getFacebookName(accountld) // Инициализация свойства

    private fun getFacebookName(accountld: Int): String {
        return ""
    }
}

interface User33 {
    val email: String
    val nickname: String
        get() = email.substringBefore('@')
    // Свойство не имеет поля для хранения значения:
    // результат вычисляется при каждой попытке доступа
}

class User44(val name: String) {
    var address: String = "unspecified"
        set(value: String) {
            println("""
                Address was changed for $name:
                "$field" -> "$value""".trimIndent()) // Чтение значения из поля
            field = value                            // Изменение значения поля
        }
}

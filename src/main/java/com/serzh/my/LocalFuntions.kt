package com.serzh.my

fun main(args: Array<String>) {

}

class User(val id: Int, val name: String, val address: String)

fun saveUserLast(user: User) {
    user.validateBeforeSave()

    // Сохранение пользователя в базу данных
}

fun User.validateBeforeSave() {
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException(
                    "Can't save user ${id}: empty $fieldName")
        }
    }

    validate(name, "Name")
    validate(address, "Address")
}


fun saveUser(user: User) {

    if (user.name.isEmpty()) {
        throw IllegalArgumentException(
                "Can't save user ${user.id}: empty Name")
    }

    if (user.address.isEmpty()) {
        throw IllegalArgumentException(
                "Can't save user ${user.id}: empty Address")

    }
    // Сохранение информации о пользователе в базе данных
}

//saveUser(User(l, '"'))
//java.lang.IllegalArgumentException: Can't save user 1: empty Name

fun saveUser2(user: User) {
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException(
                    "Can't save user ${user.id}: empty $fieldName")
        }
    }

    validate(user.name, "Name")
    validate(user.address, "Address")

    // Сохранение информации о пользователе в базе данных
}
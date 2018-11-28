package com.serzh.my.classes_objects_interfaces

import java.io.Serializable

//КлассА, объявленный внутри другого класса В            В Java          В Kotlin
//Вложенный класс (не содержит ссылки на внешний класс)  static class А  class А
//Внутренний класс (содержит ссылку на внешний класс)    class А         inner class А


class Outer {

    val a = "Outside Nested class."

    class Nested {      // Это аналог статического вложенного класса в Java
        val b = "Inside Nested class."
        fun callMe() = "Function call from inside Nested class."
    }

    inner class Inner {
        fun callMe() = a
    }
}

fun main(args: Array<String>) {
    // accessing member of Nested class
    println(Outer.Nested().b) // Inside Nested class.

    // creating object of Nested class
    val nested = Outer.Nested()
    println(nested.callMe()) // Function call from inside Nested class.


    val outer = Outer()
    println("Using outer object: ${outer.Inner().callMe()}")

    val inner = Outer().Inner()
    println("Using inner object: ${inner.callMe()}")

}


interface State : Serializable

interface View {
    fun getCurrentState(): State
    fun restoreState(state: State) {}
}

class Button2 : View {
    override fun getCurrentState(): State = ButtonState()
    override fun restoreState(state: State) { /*...*/
    }

    class ButtonState : State { // Это аналог статического вложенного класса в Java
    }

    inner class Inner {

        fun getOuterReference(): Button2 = this@Button2
    }
}
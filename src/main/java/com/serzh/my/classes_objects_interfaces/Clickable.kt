package com.serzh.my.classes_objects_interfaces

fun main(args: Array<String>) {
    Button().click() // I was clicked

    val button = Button()
    button.showOff()
    button.setFocus(true)
    button.click()
}

interface Clickable {
    fun click()
    fun showOff() =println("I’m clickable!")
}

interface Focusable {
    fun setFocus(b: Boolean) =
            println("I ${if (b) "got" else "lost"} focus.")

    fun showOff() = println("I'm focusable!")
}

open class Button : Clickable, Focusable {
    override fun click() = println("I was clicked")

    override fun showOff() = super<Clickable>.showOff()
    /*override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>. showOff()
    }*/
}

open class RichButton : Clickable { // Это открытый класс: другие могут наследовать его
    fun disable(){}         // Закрытая функция:ее невозможно переопределить в подклассе
    open fun animate() {}  // Открытая функция:ее можно переопределить в подклассе
    override fun click(){} //  Переопределение открытои ̆функции также является открытым
}

open class RichButton2 : Clickable {
    final override fun click(){} // Запрет переопределени
}

abstract class Animated {
    abstract fun animate()
    //Конкретные функции в абстрактных классах по умолчанию закрыты, но их можно сделать открытыми
    open fun stopAnimating() { }
    fun animateTwice() { }
}

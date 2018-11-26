package com.serzh.my.classes_objects_interfaces


//Модификатор Соответствующий член            Комментарии
//final       He может быть переопределен     Применяется к членам класса по умолчанию
//open        Может быть переопределен        Должен указываться явно
//abstract    Должен быть переопределен       Используется только в абстрактных классах; абстрактные методы не могут иметь реализацию
//override    Переопределяет метод супе       По умолчанию переопределяющий метод открыт, если только не объявлен как final
//            или интерфейса


//Модификатор             Член класса                 Объявление верхнего уровня
//public (по умолчанию)   Доступен повсюду            Доступно повсюду
//internal                Доступен только в модуле    Доступно в модуле
//protected               Доступен в подклассах       -
//private                 Доступен в классе           Доступно в файле


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

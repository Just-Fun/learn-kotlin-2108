package com.serzh.my


fun main(args: Array<String>) {
    println("Kotlin".lastChar3()) // n
    val c = "Kotlin".lastChar1()
//    call from Java - "char lastChar1 = InlineFunctionKt.lastChar1("Java");"

    val view: View = Button()
    view.click()   // Button clicked (override)
//3.3.4. Функции-расширения не переопределяются
    view.showOff() // I'm a view! (don't override)

    val stringLC = "Kotlin".lastChar
//    stringLC.lastChar = "3"
    println(stringLC)
//    from Java
//    char sbLastChar = InlineFunctionKt.getLastChar("Kotlin?"); // ?

    val sb = StringBuilder("Kotlin?") // n
    sb.lastChar = '!'
    println(sb) // Kotlin!
//    from Java
//    StringBuilder stringBuilder = new StringBuilder("Kotlin?");
//    InlineFunctionKt.setLastChar(stringBuilder, '!'); //   stringBuilder -> Kotlin!

}

fun String.lastChar0(): Char = this.get(this.length - 1)
fun String.lastChar1(): Char = get(this.length - 1)
fun String.lastChar2(): Char = this[this.length - 1]
fun String.lastChar3(): Char = this[length - 1]

val String.lastChar: Char
    get() = get(length - 1)

var StringBuilder.lastChar: Char
    get() = get(length - 1)                     // - Метод чтения для свойства
    set(value: Char) {
        this.setCharAt(length - 1, value) // - Метод записи для свойства
    }

//statics...
fun View.showOff() = println("I'm a view!")

fun Button.showOff() = println("I'm a button!")
//From Java
//View view = new Button();
//InlineFunctionKt.showOff(view); // I'm a view!

open class View {
    open fun click() = println("View clicked")
}

class Button : View() {
    override fun click() = println("Button clicked")
}
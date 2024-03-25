package oop

fun main() {
    val cat = Cat("Adriano")
    cat.name = "Maizena"
    println("Hello ${cat.name}")
    cat.sayHi()

    val catSarah = Cat("Sarah")
    catSarah.name = "Tigrão"
    catSarah.sayHi()
}
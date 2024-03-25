package oop

class Cat constructor(
    private val ownerName: String
) {
    var name: String? = null

    fun sayHi() {
        println("Hi $ownerName, my name is $name")
    }
}
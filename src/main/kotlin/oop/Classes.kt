package oop

fun main() {
    // instancia da class
    val tv = SmartDevice()
    tv.brand = "Samsung Smart TV"
    tv.price = 1000.00
    println("${tv.brand} ${tv.price}")
    tv.turnOn()
    tv.getDeviceState()

    val tv2 = SmartDevice()
    tv2.brand = "Samsung Smart TV"
    tv2.price = 1000.00

    val phone = SmartDevice()
    phone.brand = "Apple Iphone"
    phone.price = 500.00
    println("${phone.brand} ${phone.price}")
    phone.turnOff()
    phone.getDeviceState()

    val smartwatch = SmartDevice()
    smartwatch.brand = "Apple"
    smartwatch.price = -1.0
    println("${smartwatch.brand} ${smartwatch.price}")

    val personOne = Person(
        "Adriano",
        21
    )
    println("${personOne.name} and ${personOne.ager}")

    val personTwo = Person(
        "Adriano"
    )
    println("${personTwo.name} and ${personTwo.ager}")

    val personThree = Person()
    println("${personThree.name} and ${personThree.ager}")

    // to string
    println(tv)
    // equals
    println(tv.equals(tv2))
}

class SmartDevice {
    // por default é incluido: get() = field
    var brand: String = ""
    var price: Double = 0.0
        set(value) {
            field = if (value <= 0.0) 1.0 else value
        }
    var state: Boolean = false

    fun getDeviceState() {
        println("$brand is on: $state")
    }

    fun turnOn() {
        state = true
    }

    fun turnOff() {
        state = false
    }

    override fun toString(): String {
        return "SmartDevice(brand='$brand', price=$price, state=$state)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as SmartDevice

        if (brand != other.brand) return false
        if (price != other.price) return false
        if (state != other.state) return false

        return true
    }
}

// class Person constructor ()
class Person (
    var name: String,
    var ager: Int = 0
) {
    // multiples constructos
    constructor() : this("", 0)
    constructor(
        name: String
    ) : this(name, 0)
}
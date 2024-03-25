package flowcontrol

fun main() {
    val input = "M"

    when(input) {
        "M" -> println("MALE")
        "F" -> println("FEMALE")
        else -> {
            println("Unknown Gender")
        }
    }

    val gender = when(input) {
        "M" -> "MALE"
        "F" -> "FEMALE"
        else -> {
            "Unknown Gender"
        }
    }
    println(gender)

    val n1: Int = 10
    val n2: Int = 20

    when {
        (n1 >= n2 || n1 <= 30) -> println(":)")
        (n1 == 100) -> println("foo")
        else -> println(":(")
    }

    val age = 18

    when (age) {
        in 13..19 -> println("Teenager")
        !in 0..12 -> println("Not kid")
        else -> println("Adult")
    }
}
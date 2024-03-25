package booleanlogic

fun main() {
    val isAdult = true
    val isMale = false
    println(isAdult)
    println(isMale)
    val isOrderCompleted: Boolean? = null
    println(isOrderCompleted)

    println("====================")
    // Logical Operators
    val isFemale = false
    println(isAdult && isFemale)
    println(isAdult || isFemale)
    println(!isAdult)
    println(!isFemale)

    println("====================")
    // Compare Operators
    val n1 = 10
    val n2 = 20
    println(n1 > n2)
    println(n1 >= n2)
    println(n1 < n2)
    println(n1 <= n2)
    println(n1 == n2)
}
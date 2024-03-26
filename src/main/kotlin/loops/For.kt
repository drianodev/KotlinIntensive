package loops

fun main() {
    val names = listOf("adriano", "sarah", "tigrao", "maizena")
    val numbers = intArrayOf(1, 2, 3, 4, 5)

    for (name in names) {
        print("$name ")
    }
    println()
    for (name in names) {
        val n = name.replaceFirstChar {
            it.uppercase()
        }
        print("$n ")
    }
    println()
    for ((index, value) in names.withIndex()) {
        println("the element at $index is $value")
    }
    println()
    for (i in 1..3) {
        print("$i ")
    }
    println()
    for (i in 1..100 step 10) {
        print("$i ")
    }
    println()
    for (i in 6 downTo 0) {
        print("$i ")
    }
    println()
    for (i in 6 downTo 0 step 2) {
        print("$i ")
    }
    println()
    for (i in numbers.indices) {
        print(" $i - ${numbers[i]} |")
    }
    println()
    for (n in numbers) print("$n ")
    println()
    for (i in numbers.indices.reversed()) print(" $i - ${numbers[i]} ")
    println()
    // loop in string
    val brand = "AmigosCode"
    for (letter in brand) print("$letter ")
}
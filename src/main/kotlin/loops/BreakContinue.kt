package loops

fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    for (n in numbers) {
        if (n % 2 != 0) continue
        println(n)
    }
    println()
    for (n in numbers) {
        if (n % 2 == 0) break
        println(n)
    }
}
package collections

fun main() {
    val names = listOf(
        "Adriano", "Sarah", "random", "Maizena"
    )
    // _ não e variavel
    val (one, two, _, four) = names

    println(one)
    println(two)
    println(four)
}
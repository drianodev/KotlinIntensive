package collections

fun main() {
    // list
    val names: List<String> = listOf(
        "Adriano", "Sarah"
    )
    println(names)
    println(names[0])
    println(names.size)
    println(names.contains("Adriano"))
    println(names.contains("José"))
    println(names.first())
    println(names.last())
    println(names.indexOf("Sarah"))
    println(names.isNotEmpty())

    println()

    // mutable list
    val pets = mutableListOf(
        "Tigrão", "Maizena"
    )
    println(pets)
    println(pets[0])
    println(pets.size)
    println(pets.contains("Tigrão"))
    println(pets.contains("José"))
    println(pets.first())
    println(pets.last())
    println(pets.indexOf("Maizena"))
    pets.add("random")
    println(pets)
    pets.remove("random")
    println(pets)

    println()
    val emptyList = mutableListOf<Any>()
    println(emptyList.isEmpty())
}
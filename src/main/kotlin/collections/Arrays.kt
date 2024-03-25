package collections

fun main() {
    // Criação de um array
    val array = arrayOf(
        "Adriano", "Sarah", 2
    )
    println(array)

    // Criação de array com tipo definido
    val names = arrayOf<String>(
        "Adriano", "Sarah"
    )
    println(names.contentToString())
    println(names[0])
    println(names[1])
    println(names.size)

    if ("Hello" in names) {
        println("found")
    } else {
        println("not found")
    }
    
    // Iniciar array vazio
    val arrayOfNulls = arrayOfNulls<String>(5)
    println(arrayOfNulls.contentToString())
    arrayOfNulls[3] = "Adriano"
    println(arrayOfNulls.contentToString())
    arrayOfNulls.fill("*")
    println(arrayOfNulls.contentToString())
}
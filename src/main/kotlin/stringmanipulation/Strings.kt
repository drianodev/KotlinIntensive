package stringmanipulation

fun main() {
    val name = "Adriano"
    println(name)
    println(name.uppercase())
    println(name.lowercase())
    println(name.length)
    println(name[0])
    println(name[6])
    println(name.isEmpty())
    println("".isEmpty())

    val age = 20
    val msg1 = name + " " + age
    val msg2 = "Name: ${name}, Age: ${age}"
    val msg3 = "Name: $name, Age: $age"
    println(msg1)
    println(msg2)
    println(msg3)

    val msg4 = """
        Hello
        How are you?
        I love you
            ...puts
    """.trimIndent()
    println(msg4)

    val msg5 = """
        Hello %s
        How are you?
    """.trimIndent()
    println(msg5.format("Adriano"))


    val name1 = "Adriano"
    val name2 = "Sarah"
    val name3 = "Adriano"
    // O operador == compara os conteúdos das strings
    println(name1 == name2)
    // O método equals também compara os conteúdos das strings
    println(name1.equals(name2))
    println(name1 == name3)
    println(name1.equals(name3))
    val name4 = String("Adriano".toCharArray())
    println("== ${name1 == name4}")
    // O operador === compara as referências de objeto
    println("=== ${name1 === name3}")
    println("=== ${name1 === name4}")
    println(".equals ${name1.equals(name4)}")
}
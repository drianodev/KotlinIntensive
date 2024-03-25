package fundamentals

// usado para declarar uma constante cujo valor é conhecido em tempo de compilação
// deve ficar fora da função
const val PI = 3.14

fun main() {

    // Não pode ser nula
    var name: String = "Adriano"
    // Pode ser nula
    var lastName: String? = "Lima"

    var age: Int = 20
    // val é para somente leitura, ou seja não pode ser reatribuida
    val year: String = "2002"

    println("name: ${name} ${lastName}")
    print("Age: ")
    println(age)
    println("Year: ${year}")

}
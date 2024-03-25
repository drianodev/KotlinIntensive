package flowcontrol

fun main() {
    val n1 = 10
    val n2 = 20

    if (n1 > n2) {
        println("maior")
    } else if (n1 == n2) {
        println("igual")
    } else {
        println("menor")
    }

    val value = if (n1 > n2) {
                    "maior"
                } else {
                    "menor"
                }

    println(value)

    // kotlin não possui operador ternário
    // var result = n1 > n2 ? ":)" : ":("
    var result = if (n1 > n2)  ":)" else ":("
    println(result)

    var result2 =
                    if (n1 > n2)  ":)"
                    else if (n1 == n2) ":|"
                    else ":("
    println(result2)
}
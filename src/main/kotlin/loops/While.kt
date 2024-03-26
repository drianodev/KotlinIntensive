package loops

fun main() {
    var n = 0

    println("++n")
    while (n <= 10) {
        print("$n ")
        ++n
    }
    println()
    n = 0
    println("n++")
    while (n <= 10) {
        print("$n ")
        n++
    }
    n = 10
    println()
    println("--n")
    while (n > 0) {
        print("$n ")
        --n
    }
    println()
    n = 10
    println("n--")
    while (n > 0) {
        print("$n ")
        n--
    }
    println()
    val brand = "AmigosCode"
    var index = 0
    while (index <= brand.length - 1) {
        print("${brand[index]} ")
        ++index
    }

    println()
    val array = charArrayOf('a', 'b', 'c')
    var i = 0
    do {
        print("${array[i]} ")
        i++
    } while (i < array.size)
}
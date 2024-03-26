package functions

fun main() {
    greet()
    greet("Adriano")
    greet("Adriano", 21)
    greet(age = 22, name = "Sarah")
    sum(1, 2)
    sum(1)
    //
    foo(bar = {
        println("bar as function")
    })
    //
    println(mod())
    println(mod(5, 2))
    //
    double(5)
    //
    println(twoValues())
    println(threeValues())
}

// default is public
// unit == void, default is Unit
fun greet() {
    println("Hello")
}

fun greet(name: String) {
    println("Hello $name")
}

fun greet(name: String, age: Int) {
    println("Hello $name")
    if (age >= 18) {
        println("$name is adult")
    } else {
        println("$name not is adult")
    }
}

// é possivel definir valores padrões
fun sum(n1: Int, n2: Int = -1){
    if (n2 < 0) println("oh fuck")
    else println(n1+n2)
}

fun foo(bar: () -> Unit) {
    println("bar function")
    bar()
}

fun mod(n1: Int = 10, n2: Int = 2) : Int {
    return n1 % n2
}

fun double(n: Int) : Int = n * 2

fun twoValues(): Pair<String, Int> {
    return "Adriano" to 21
}

fun threeValues(): Triple<String, Int, Char> {
    return Triple(
        "Adriano",
        21,
        'A'
    )
}
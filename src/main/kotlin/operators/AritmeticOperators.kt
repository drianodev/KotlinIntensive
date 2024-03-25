package operators

import fundamentals.PI
import kotlin.math.max
import kotlin.math.min
import kotlin.math.round
import kotlin.math.sqrt

fun main() {
    val n1 = 10
    val n2 = 2
    println("+ ${n1 + n2}")
    println("- ${n1 - n2}")
    println("/ ${n1 / n2}")
    println("* ${n1 * n2}")
    println("% ${n1 % n2}")

    // math
    println(PI)
    println(max(n1, n2))
    println(min(n1, n2))
    println(sqrt(5.0))
    println(round(4.2))
    println(round(4.6))

    // ++ and  --
    println("inc and dec")
    var n3 = 10
    println(n3++)
    println(n3)
    n3 = 10
    println(++n3)
    println(n3)
    n3 = 10
    println(n3--)
    println(n3)
    n3 = 10
    println(--n3)
    println(n3)

    // plus sign
    val sum = 10 + 10
    val sumString = "10" + "10"
    println("sum on numbers: $sum")
    println("sum on string: $sumString")

    // convert
    val n4 = "10"
    println(10 + n4.toInt())
    val n5 = 10
    println(n5.toString() + n4)
    println("10$n4")
    val n6 = 3.0
    println(n6)
    println(n6.toInt())
}
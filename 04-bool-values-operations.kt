fun main() {
    println("Boolean values and operations")
    var cookiePolicyAccepted: Boolean = true
    println("Cookie policy accepted = " + cookiePolicyAccepted)

    println("Boolean operations")
    println("A" == "A") // true
    println("A" == "B") // false
    println(10 == 10) // true
    println(20 == 10) // false

    println("A" != "A") // false
    println("A" != "B") // true
    println(10 != 10) // false
    println(20 != 10) // true

    println(10 > 10) // false
    println(20 > 10) // true
    println(10 > 20) // false

    println(10 < 10) // false
    println(20 < 10) // false
    println(10 < 20) // true

    println(10 >= 10) // true
    println(20 >= 10) // true
    println(10 >= 20) // false

    println(10 <= 10) // true
    println(20 <= 10) // false
    println(10 <= 20) // true
}

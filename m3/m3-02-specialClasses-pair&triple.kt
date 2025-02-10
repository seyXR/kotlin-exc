fun main() {
    // pair & triple
    val pair = 1.0 to "A"
    println(pair.first) // 1.0
    println(pair.second) // A
    val (number, letter) = pair
    // The type of number is Double
    // The type of letter is Char
    println(number) // 1.0
    println(letter) // A

    val triple = Triple(1, 2, 3)
    println(triple.first) // 1
    println(triple.second) // 2
    println(triple.third) // 3
    val (num1, num2, num3) = triple
    // The type of num1 is Int
    // The type of num2 is Int
    // The type of num3 is Int
}

fun main() {
    println("Hello, world")

    // Declaración de variables con tipos primitivos
    val aInt = 10 // Int
    val bLong = 2147483647L // Long
    val cDouble = 10.0 // Double
    val dFloat = 10F // Float

    val smallDebt = -0.72
    println(smallDebt) // -0.72

    val million = 1_000_000
    println(million) // 1000000

    // Conversiones explícitas de tipos
    val i: Int = 10
    val l: Long = i.toLong()
    val d1: Double = i.toDouble()
    val d2: Double = l.toDouble()
    println(d1) // 10.0
    println(d2) // 10.0

    // Operaciones básicas
    println(2 + 3) // 5
    println(2 - 3) // -1
    println(2 * 3) // 6
    println(8 / 2) // 4

    println(0.5 * 4.5) // 2.25
    println(2.5 / 0.5) // 5.0
    println(10 % 3) // 1
    println(11 % 3) // 2
    println(12 % 3) // 0
    println(13 % 3) // 1

    // Signo en operaciones de módulo
    println(-1 % 3) // -1
    println(1 % -3) // 1
    println(-1 % -3) // -1

    // Operaciones con mezcla de tipos
    val resultLong = 1 + 2L // Long
    val resultDouble1 = 1 + 2.0 // Double
    val resultFloat = 1.0F + 2 // Float
    val resultDouble2 = 1.0F + 2.0 // Double

    // Operaciones matemáticas
    val num1 = 5
    val num2 = 2
    println(num1 / num2) // 2
    println(num1.toDouble() / num2) // 2.5
    println(1 + 2 * 3) // 7
    println((1 + 2) * 3) // 9

    // Variables modificables
    var mutableA = 10
    println(mutableA) // 10
    mutableA = 20
    println(mutableA) // 20

    mutableA = 10
    println(mutableA) // 10
    mutableA += 10
    println(mutableA) // 20
    mutableA += 10
    println(mutableA) // 30

    mutableA = 10
    println(mutableA) // 10
    mutableA *= 3
    println(mutableA) // 30
    mutableA -= 12
    println(mutableA) // 18
    mutableA /= 3
    println(mutableA) // 6
    mutableA %= 4
    println(mutableA) // 2

    // Incrementos y decrementos
    mutableA = 10
    println(mutableA) // 10
    mutableA++
    println(mutableA) // 11
    mutableA--
    println(mutableA) // 10
}

// Add your function below this line
fun getPoints(basePoints: Int, boost: Int): Int {
    return basePoints * boost
}

fun factorial(number: Int): Int {

    var accumulator = 1

    for (i in 1..number) {

        accumulator = accumulator * i
    }

    return accumulator
}

fun factorialv2(number: Int): Int {

    if (number <= 1) {
        return 1
    }
    return factorial(number - 1) * number
}

fun main() {
    var score = 0
    println(score)
    score += getPoints(10, 1)
    println(score)
    score += getPoints(20, 2)
    println(score)
    score += getPoints(-10, 1)
    println(score)
    score += getPoints(5, 3)
    println(score)
    score += getPoints(-15, 2)

    println("ACCUMULATOR")
    println(factorial(1)) // 1
    println(factorial(2)) // 2
    println(factorial(3)) // 6
    println(factorial(4)) // 24
    println(factorial(5)) // 120
    println(factorial(6)) // 720

    println("Factorial Function")
    println(factorialv2(1)) // 1
    println(factorialv2(2)) // 2
    println(factorialv2(3)) // 6
    println(factorialv2(4)) // 24
    println(factorialv2(5)) // 120
    println(factorialv2(6)) // 720
}

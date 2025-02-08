fun printStars(num: Int) {
    for (j in 1..num) {
        print("*")
    }
    println()
}

fun ascendingTriangle(height: Int) {
    for (stars in 1..height) {
        printStars(stars)
    }
}

fun descendingTriangle(height: Int) {
    for (stars in height downTo 1) {
        printStars(stars)
    }
}

fun isoscelesTriangle(width: Int) {
    ascendingTriangle(width - 1)
    descendingTriangle(width)
}

fun triangleArea(width: Double, height: Double): Double {
    return width * height / 2
    println("Will never be called")
}

// fun biggerOf(a: Int, b: Int): Int {
//     if (a > b) {
//         return a
//     } else {
//         return b
//     }
// }

/// SAME AS:
fun biggerOf(a: Int, b: Int): Int = if (a > b) a else b

// Single-expression functions

fun main() {
    println("Ascending triangle:")
    ascendingTriangle(5)
    println("Descending triangle:")
    descendingTriangle(5)
    println("Isosceles triangle:")
    isoscelesTriangle(5)

    println("Functions with return:")
    val area: Double = triangleArea(1.0, 2.0)
    println(area) // 1.0
    println(triangleArea(2.0, 2.0)) // 2.0
    println(triangleArea(5.0, 5.0)) // 12.5
    println(triangleArea(10.0, 20.0)) // 100.0

    println("Bigger of two numbers:")
    println(biggerOf(3, 1)) // 3
    println(biggerOf(10, 20)) // 20

    println("Unreachable code after return")
    println(triangleArea(10.0, 20.0)) // 100.0

    println(biggerOf(3, 1)) // 3
    println(biggerOf(10, 20)) // 20

    println("Single-expression functions")
}

////// INFO:

// fun {function name}({parameters}): {result type} = {expression body}

// // is equivalent to

// fun {function name}({parameters}): {result type} {
//     return {expression body}
// }

// fun triangleArea(width: Double, height: Double): Double = width * height / 2

// // is equivalent to

// fun triangleArea(width: Double, height: Double): Double {
//     return width * height / 2
// }

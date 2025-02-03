fun main() {
    println("Nested loops")

    println("STAR TRIANGLE")
    for (i in 1..5) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }

    println("rombo -----------------")
    val height = 10
    for (i in 1..height) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }
    /// downTo function
    for (numberOfStars in height downTo 1) {
        for (j in 1..numberOfStars) {
            print("*")
        }
        println()
    }
    println("rombo mini -----------------")
    val width = 5
    for (i in 1 until width step 2) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }
    for (i in width downTo 1 step 2) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }

    println("minitriangulo -----------------")

    for (i in 1..5) {
        val numberOfSpaces = 5 - i
        for (j in 1..numberOfSpaces) {
            print(" ")
        }
        val numberOfStars = i
        for (j in 1..numberOfStars) {
            print("*")
        }
        println()
    }

    println("isosceles triangle -----------------")

    for (i in 1..5) {
        val numberOfSpaces = 5 - i
        for (j in 1..numberOfSpaces) {
            print(" ")
        }
        val numberOfStars = i * 2 - 1
        for (j in 1..numberOfStars) {
            print("*")
        }
        println()
    }
}

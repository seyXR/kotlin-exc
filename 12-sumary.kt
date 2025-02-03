fun main() {

    println("Practice creating Loops")

    println("Task 1 - Triángulo rectángulo invertido -----------------")
    for (i in 5 downTo 1) {
        val numberOfSpaces = 5 - i
        for (j in 1..numberOfSpaces) {
            print(" ")
        }
        val numberOfStars = i
        for (j in numberOfStars downTo 1) {
            print("*")
        }
        println()
    }

    println("Task 2 - Triángulo Isósceles Invertido -----------------")

    for (i in 1..5) {
        val numberOfSpaces = i - 1
        for (j in 1..numberOfSpaces) {
            print(" ")
        }
        val numberOfStars = 5 - i + 1
        for (j in 1..numberOfStars) {
            print("*")
        }
        println()
    }

    println("Task 3 - 1/2 Rombo -----------------")
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
}

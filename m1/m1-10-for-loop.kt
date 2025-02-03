fun main() {
    val letters = listOf("A", "B", "C")
    for (letter in letters) {
        println("The next letter is $letter")
        // The next letter is A
        // The next letter is B
        // The next letter is C
    }
    println("More on the for-loop")

    var a = 0
    var b = 5

    println("To call code for each number from 0 to 5, including 5")
    for (i in a..b) {
        println(i)
    }
    println("To call code for each number from a to b, excluding b")
    for (i in a until b) {
        println(i)
    }
    a = 5
    b = 0
    println("To call code for each number from a to b, where a is bigger than b")
    for (i in b downTo a) {
        println(i)
    }
    a = 0
    b = 10
    var c = 3
    println(
            """To call code for each number from a to b, 
            with a step c, use a..b step c inside a for-loop"""
    )
    a = 10
    b = 1
    for (i in a..b step c) {
        println(i)
    }
    println(
            """To call code for each number from a to b, 
            excluding b, with a step c, use a until b step c inside a for-loop."""
    )
    for (i in a until b step c) {
        println(i)
    }
    println(
            """To call code for each number from a to b, 
    where a is bigger than b, with a step -c, 
    use a downTo b step c inside a for-loop."""
    )
    for (i in a downTo b step c) {
        println(i)
    }

    for (num in 5 downTo 1) {
        println("$num lemonades are left")
        println("Glupglupglup")
    }
    println("That is it")
    println("Now I have to go")
}

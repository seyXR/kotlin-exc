fun main() {
    println("While statement for loops")
    println("ChatGPT sample of a while loop in Kotlin")
    // Using an if statement
    val x = 5
    if (x > 0) {
        println("$x is positive")
    }
    // Using a while loop
    var y = 5
    while (y > 0) {
        println("$y is positive")
        y-- // Decrease y to eventually stop the loop
    }

    println("Will be printed")
    if (true) {
        println("Will be printed")
    }
    if (false) {
        println("Will not be printed")
    }
    println("Will be printed")

    println("USING WHILE AND IF STATEMENTS")
    while (false) {
        println("Will not be printed")
    }
    if (false) {
        print("Will not be printed")
    }

    println("WHILW loop")
    var toBePrinted = true
    while (toBePrinted) {
        println("Will be printed once")
        toBePrinted = false
    }

    var printedTimes = 0
    while (printedTimes < 5) {
        println("Will be printed $printedTimes times")
        printedTimes++
    }

    println("Mathematical sequences")
    // imprime los números del 1 al 100 sumando de 7 en 7
    var num = 0
    while (num < 100) {
        println(num)
        num += 7 // or num = num + 7
    }

    // imprime los números del 1 al 100 en múltiplos de 2
    num = 1
    while (num < 100) {
        println(num)
        num *= 2 // or num = num + 7
    }

    // imprime un loop  del 1 al 100
    var i = 1
    while (i <= 100) {
        println(i)
        i++ // or i = i + 1 or i += 1
    }
}

// //Defining and throwing exceptions
// class MyError: Throwable("Some message")

// fun someFunction() {
//     throw MyError()
// println("Will not be printed")
// }

// fun main() {
//     try {
// someFunction()
// println("Will not be printed")
//     } catch (e: Throwable) {
// println("Caught $e") // Caught MyError: Some message
//     }
// }

// ///Exception report and stack trace
// class MyError: Throwable("Some message")

// fun someFunction() {
//     throw MyError()
// println("Will not be printed")
// }

// fun main() {
// someFunction()
// println("Will not be printed")
// }

// ------ >> Finally block
fun someFunction() {
    println("Will be printed") // Will be printed
}

fun main() {
    try {
        someFunction()
        println("Will be printed") // Will be printed
    } finally {
        println("Finally block was called") // Finally block was called
    }
    println("Will be printed") // Will be printed
}

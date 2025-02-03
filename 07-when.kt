fun main() {
    println("WHEN statement")

    println("Is it going to rain?")
    var probability = 70
    when {
        probability < 40 -> {
            println("Unlikely")
        }
        probability <= 80 -> {
            println("Likely")
        }
        probability < 100 -> {
            println("Yes")
        }
        else -> {
            println("What?")
        }
    }

    println("Is it going to rain?")
    probability = 70
    when {
        probability < 40 -> println("Unlikely")
        probability <= 80 -> println("Likely")
        probability < 100 -> println("Yes")
        else -> println("What?")
    }

    println("Is it going to rain?")
    probability = 70
    var text =
            when {
                probability < 40 -> "Unlikely"
                probability <= 80 -> "Likely"
                probability < 100 -> "Yes"
                else -> "What?"
            }
    println(text)

    var number = 1 // or 2, 3, 4, 5, 6
    when (number) {
        1 -> {
            println("Missed hit")
        }
        2, 3, 4, 5 -> {
            println("Hit with value $number")
        }
        6 -> {
            println("Critical hit")
        }
    }

    number = 3 // or 2, 3, 4, 5, 6
    text =
            when (number) {
                1 -> "Missed hit"
                2, 3, 4, 5 -> "Hit with value $number"
                6 -> "Critical hit"
                else -> "Unsupported value"
            }
    println(text)

    number = 6 // or 2, 3, 4, 5, 6
    text =
            when (number) {
                1 -> "Missed hit"
                in 2..5 -> "Hit with value $number"
                6 -> "Critical hit"
                else -> "Unsupported value"
            }
    println(text)

    var value: Any = "ABC" // Declaramos value como Any

    println(value is String) // true
    println(value is Int) // false
    println(value is Boolean) // false
    println(value is Any) // true

    value = 123 // Ahora podemos asignar un Int

    println(value is String) // false
    println(value is Int) // true
    println(value is Boolean) // false
    println(value is Any) // true

    val something: Any = "ABC" // or 123, 0.1, true
    when (something) {
        is String -> println("This is String")
        is Int -> println("This is Int")
        is Double -> println("This is Double")
        is Boolean -> println("This is Boolean")
    }
    println(something)
}

fun main() {
    println("Exercise: Practice using conditions")
    println("The Little Lemon")

    var weekday = "Friday"
    var hour = 20
    println("On $weekday, the opening hours are: $hour")

    println("Task 1 - Opening hours")
    when {
        weekday == "Monday" -> println("8:00 - 12:00")
        weekday == "Tuesday" -> println("8:00 - 18:00")
        weekday == "Wednesday" -> println("8:00 - 18:00")
        weekday == "Thursday" -> println("8:00 - 18:00")
        weekday == "Friday" -> println("8:00 - 21:00")
        weekday == "Saturday" -> println("9:00 - 16:00")
        weekday == "Sunday" -> println("8:00 - 16:00")
    }
    if (weekday == "Monday") {
        println("8:00 - 12:00")
    } else if (weekday == "Tuesday") {
        println("8:00 - 18:00")
    } else if (weekday == "Wednesday") {
        println("8:00 - 18:00")
    } else if (weekday == "Thursday") {
        println("8:00 - 18:00")
    } else if (weekday == "Friday") {
        println("8:00 - 21:00")
    } else if (weekday == "Saturday") {
        println("9:00 - 16:00")
    } else if (weekday == "Sunday") {
        println("8:00 - 16:00")
    }

    println("Task 2 - Is the Little Lemon open?")

    val isOpen =
            when (weekday) {
                "Monday" -> hour in 8..11
                "Tuesday" -> hour in 8..17
                "Wednesday" -> hour in 8..17
                "Thursday" -> hour in 8..17
                "Friday" -> hour in 8..20
                "Saturday" -> hour in 9..15
                "Sunday" -> hour in 8..15
                else -> false
            }
    // Código largo
    // when (weekday) {
    //     "Monday" -> hour >= 8 && hour < 12
    //     "Tuesday" -> hour >= 8 && hour < 18
    //     "Wednesday" -> hour >= 8 && hour < 18
    //     "Thursday" -> hour >= 8 && hour < 18
    //     "Friday" -> hour >= 8 && hour < 21
    //     "Saturday" -> hour >= 9 && hour < 16
    //     "Sunday" -> hour >= 8 && hour < 16
    //     else -> false
    // }
    if (isOpen) {
        println("The Little Lemon is open now")
    } else {
        println("The Little Lemon is closed now")
    }
}

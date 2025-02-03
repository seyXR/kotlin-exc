fun main() {
    val weekday = "Friday"
    val hour = 20

    val hours =
            mapOf(
                    "Monday" to "8:00 - 12:00",
                    "Tuesday" to "8:00 - 18:00",
                    "Wednesday" to "8:00 - 18:00",
                    "Thursday" to "8:00 - 18:00",
                    "Friday" to "8:00 - 21:00",
                    "Saturday" to "9:00 - 16:00",
                    "Sunday" to "8:00 - 16:00"
            )

    println("The Little Lemon")
    println("On $weekday, the opening hours are: ${hours[weekday]}")

    val isOpen =
            when (weekday) {
                "Monday" -> hour in 8..11
                "Tuesday", "Wednesday", "Thursday" -> hour in 8..17
                "Friday" -> hour in 8..20
                "Saturday" -> hour in 9..15
                "Sunday" -> hour in 8..15
                else -> false
            }

    println("Task 1 - Opening hours: ${hours[weekday]}")
    println(
            "Task 2 - Is the Little Lemon open? ${if (isOpen) "The Little Lemon is open now" else "The Little Lemon is closed now"}"
    )
}

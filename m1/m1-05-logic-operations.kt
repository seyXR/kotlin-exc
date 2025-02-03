fun main() {
    println("Boolean values and operations")

    println("The 'and' operator (&&)")
    val finishedHomework = false // or true
    val cleanedRoom = true // or false
    val canPlayGames = finishedHomework && cleanedRoom
    println(canPlayGames)

    println("comparing operators")
    print(cleanedRoom && cleanedRoom) // true
    print(cleanedRoom && finishedHomework) // false
    print(finishedHomework && cleanedRoom) // false
    print(finishedHomework && finishedHomework) // false

    println("Steven would like to get a puppy")
    val haveTime = true
    val isResponsible = false
    val canHavePuppy = isResponsible && haveTime
    print(canHavePuppy) // false

    println("% operator")
    var percent = 47
    val correct = percent >= 0 && percent <= 100
    println(correct) // true

    println("The 'or' operator (||)")
    val carCleaned = false // or true
    val grassCut = true // or false
    val canGoToCinema = carCleaned || grassCut
    println(canGoToCinema)

    // The operator or represents an alternative. It returns true if any of its sides returns true.
    print(true || true) // true
    print(true || false) // true
    print(false || true) // true
    print(false || false) // false

    println("""Let's say Steven can eat chocolate 
    if he behaves well or cleans his room. """)
    val behavesWell = false // or true
    val cleansRoom = false // or true
    val canEatChocolate = behavesWell || cleansRoom
    println(canEatChocolate)

    percent = 47
    val incorrect = percent < 0 || percent > 100
    println(incorrect) // true

    println("The 'not' operator (!)")
    println(!true) // false
    println(!false) // true

    val isAmazing = true
    print(!isAmazing) // false

    val isBoring = false
    print(!isBoring) // true

    val positive = 1
    print(-positive) // -1

    val negative = -1
    print(-negative) // 1

    println(!true) // false
    println(!!true) // true
    println(!!!true) // false
    println(!!!!true) // true
    println(!!!!!true) // false

    val failedMathExam = true
    val roomCleaned = true
    val canPlayGamesNot = !failedMathExam && roomCleaned
    println(canPlayGamesNot) // false

    println(!true && false) // false
    println(!(true && false)) // true
    println(-10 + 20) // 10
    println(-(10 + 20)) // -30

    println("The 'xor' operator")
    val isWeekend = true
    val isSunny = false
    val canGoToBeach = isWeekend xor isSunny
    println(canGoToBeach) // true

    println("----------- FINAL XCERCISE -----------")
    var cleanedRoomFinal = true
    var passedTest = true
    var isGrounded = true

    println("It's " + (cleanedRoomFinal && passedTest) + " cleaned room and passed test") //
    println("It's " + (!isGrounded || passedTest) + " is not grounded or passed test") // true
    println(
            "It's " + (cleanedRoomFinal && !passedTest) + " cleaned room and not passed test"
    ) // true
    println(
            "It's " + (!(isGrounded && !passedTest)) + ", he is grounded and didn't pass the test"
    ) // true
    println(
            "It's " +
                    (!(!cleanedRoomFinal || !passedTest)) +
                    ", he has not cleaned room or not passed test"
    ) // false
}

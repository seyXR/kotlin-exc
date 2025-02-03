fun main() {
    // Operaciones básicas
    println("Task 1")
    var a = (123 + 456 * 789)
    println("Step 1 result = " + a)
    var b = (1 + 2 * 3 + 4 * 5 + 6 * 7 + 8 * 9)
    println("Step 2 result = " + b)
    var c = (((1 + 2) * 3 + 4 * 5 + 6 * (7 + 8) * 9))
    println("Step 3 result = " + c)
    var d = (13530.0 / 1.2)
    println("Step 4 result = " + d)

    // Operaciones con mezcla de tipos
    println("Task 2")
    val scoreLevel1 = 79
    val scoreLevel2 = 92
    val scoreLevel3 = 86

    val totalScore = scoreLevel1 + scoreLevel2 + scoreLevel3
    val averageScore = totalScore / 3
    println("Total Score =  " + totalScore)
    println("Average Score =  " + averageScore)

    // Operaciones matemáticas
    println("Task 3")
    val boostMultiplier = 4
    val scoreBoost = totalScore * boostMultiplier
    val finalBoostedScore = totalScore + scoreBoost

    println("Score Boost =  " + scoreBoost)
    println("Final Boosted Score =  " + finalBoostedScore)
}

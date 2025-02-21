fun main() {
    val list = listOf("A", "B")
    val letters = listOf("A", "B", "C")
    for (letter in letters) {
        println(letter)
    }
    println(list + "C") // [A, B, C]
    println(list + listOf("C", "D")) // [A, B, C, D]
    println("A" !in list) // false
    println(listOf("Z") + list) // [Z, A, B]
    println(list.size) // 3
    println(list.size == 0) // False
    println(list.isEmpty()) // False

    val empty: Set<Int> = setOf()
    println(empty.size == 0) // True
    println(empty.isEmpty()) // True
}

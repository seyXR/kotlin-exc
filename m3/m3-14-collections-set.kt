class User(val name: String)

fun main() {
    val set = setOf(User("A"), User("A"))
    println(set + User("A")) // [User@XXX, User@YYY, User@ZZZ]
    val set2 = setOf(User("A"), User("A"))
    println(set2 + User("A")) // [User(name=A)]

    val letters = setOf("A", "B", "C")
    println("A" !in letters) // false
    println("Z" !in letters) // true
}

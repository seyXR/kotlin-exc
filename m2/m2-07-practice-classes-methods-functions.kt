class Dog(val name: String) {
    var hunger = 62

    fun feed() {
        println("Feeding ${this.name}")
        this.hunger = 0
    }
}

class User(var name: String) {

    fun changeName(name: String) {

        println("Changed name from ${this.name} to $name")

        this.name = name
    }
}

fun main() {
    val dog = Dog("Rex")
    dog.feed() // Feeding Rex

    val user = User("Alpha") // Changed name from Alpha to Beta
    user.changeName("Beta") // Beta
    println(user.name)

    println("Methods on String")
    val text = "Some Text"
    println(text.uppercase()) // SOME TEXT
    println(text.lowercase()) // some text
    println(text.replace("Text", "New Text"))
    println("A V A C".replace("A", "X")) // X V X C

    println("Conversion methods")
    val i: Int = 10
    val l: Long = i.toLong()
    val f1: Float = i.toFloat()
    val f2: Float = l.toFloat()
    println(f1) // 10.0
    println(f2) // 10.0
}

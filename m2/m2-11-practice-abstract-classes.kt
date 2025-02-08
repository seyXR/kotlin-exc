// Definición de clase abstracta
abstract class Animal(val name: String) {
    // Método abstracto: las subclases deben implementarlo
    abstract fun makeSound()

    // Método concreto: se hereda tal cual
    fun eat() {
        println("$name está comiendo.")
    }
}

// Clase concreta que extiende la clase abstracta
class Dog(name: String) : Animal(name) {
    override fun makeSound() {
        println("$name dice: Woof!")
    }
}

class Cat(name: String) : Animal(name) {
    override fun makeSound() {
        println("$name dice: Meow!")
    }
}

fun main() {
    val dog = Dog("Rex")
    val cat = Cat("Luna")

    dog.makeSound() // Rex dice: Woof!
    cat.makeSound() // Luna dice: Meow!

    dog.eat() // Rex está comiendo.
    cat.eat() // Luna está comiendo.
}

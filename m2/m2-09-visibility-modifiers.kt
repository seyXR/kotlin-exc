open class Mammal {
    fun feedChildren() {}
}

class Dog : Mammal {
    fun fetchStick() {}
}

fun feed(mammal: Mammal) {
    mammal.feedChildren()
}

fun main() {
    val dog = Dog()
    dog.feedChildren()
    dog.fetchStick()
    feed(dog)
}

// Definimos una interfaz Animal. Las interfaces en Kotlin no tienen estado ni lógica concreta.
// Sirven para definir un contrato que las clases deben cumplir.
interface Animal

open class Mammal {
    fun feedChildren() {}
}
// Clase Dog que implementa la interfaz Animal
class Dog(val name: String) : Animal {
    fun retrieve(item: String) {
        println("$name is retrieving $item")
    }
}

// Clase Cat que también implementa la interfaz Animal
class Cat(val name: String) : Animal {
    fun pet() {
        println("$name says: Mrr")
    }
}

// Función que recibe un Animal y usa el operador "when" para determinar su tipo
fun play(animal: Animal) {
    when (animal) {
        is Dog -> animal.retrieve("stick") // Si el animal es un perro, se llama a retrieve
        is Cat -> animal.pet() // Si el animal es un gato, se llama a pet
        else -> println("Unknown animal")
    }
}

// Función que verifica si un animal es un perro usando "is"
fun checkIsDog(animal: Animal) {
    if (animal is Dog) {
        println("${animal.name} is a dog")
    } else {
        println("It is not a dog")
    }
}

// Función que consume cualquier tipo de dato, ya que "Any" es la clase raíz de todos los tipos en
// Kotlin
fun consumeAny(any: Any) {
    println("Consuming any: $any")
}

// Función que consume solo números, ya que "Number" es la clase base de Int, Double, Long, etc.
fun consumeNumber(number: Number) {
    println("Consuming number: $number")
}

fun main() {
    val dog: Dog = Dog("Rex")
    val animal: Animal = dog // Upcasting: Dog a Animal (permitido)

    // Esto causaba un error: no puedes convertir directamente un Animal a Dog sin verificar el
    // tipo.
    val dog2: Dog = animal as Dog // Uso de casting explícito con "as"
    println("Casted animal to Dog: ${dog2.name}")

    val i: Int = 120
    val l: Long = 1234567890L
    val d: Double = 10.0

    // Ejemplos de upcasting
    consumeAny(i)
    consumeAny(l)
    consumeAny(d)
    consumeNumber(i)
    consumeNumber(l)
    consumeNumber(d)

    // Ejemplo de polimorfismo
    play(Dog("Buddy")) // Buddy is retrieving stick
    play(Cat("Garfield")) // Garfield says: Mrr
}

// OPEN CLASS -----

// open class Mammal {
//     fun feedChildren() {}
// }
// class Dog: Mammal {
//     fun fetchStick() {}
// }

// fun feed(mammal: Mammal) {
//     mammal.feedChildren()
// }

// fun main() {
//     val dog = Dog()
//     dog.feedChildren()
//     dog.fetchStick()
//     feed(dog)
// }

// Interfaz Animal que define propiedades y comportamientos comunes
interface Animal {
    val breed: String
    fun pet()
}

// Clase Cat que implementa la interfaz Animal
class Cat(val name: String, override val breed: String) : Animal {
    override fun pet() {
        println("Miau") // Sonido que hace un gato
    }
}

// Clase Dog que implementa la interfaz Animal
class Dog(val name: String, override val breed: String) : Animal {
    override fun pet() {
        println("Waffh") // Sonido que hace un perro
    }
}

// Clase Emu que implementa la interfaz Animal
class Emu : Animal {
    override val breed: String = "Emu"
    override fun pet() {
        println("Emu") // Sonido que hace un emú
    }
}

// Función para acariciar un animal
fun pet(animal: Animal) {
    println("Petting ${animal.breed}")
    animal.pet()
}

fun main() {
    // Crear instancias de animales y acariciarlos
    pet(Cat("Jake", "Munchkin"))
    pet(Dog("Cookie", "Border Collie"))
    pet(Emu()) // No es necesario pasar parámetros para Emu
}

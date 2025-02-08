// fun b() {
//         // here I cannot use function a
//     }

//     fun main() {
//         // here I cannot use function a
//         fun a() {
//     println("A")
//         }
//     a() // Here I can use function a
//     b()
//     c()
//     a() // Here I can use function a
//     }

//     fun c() {
//         // here I cannot use function a
//     }

fun f1() {
    val a = "Text 1"
    println(a) // Can use a here
    // Here, I cannot use b
}

fun f2() {
    val b = "Text 2"
    println(b) // Can use b here
    // Here, I cannot use a
}

fun b() {
    // No puedo usar a() aquí porque a() solo existe dentro de main()
    println("This is function b")
}

fun main() {
    f1()
    f2()
    var name = ""

    fun setName() {
        name = "Mike"
    }

    fun printName() {
        println(name)
    }

    setName()
    printName()

    // a() no es visible aquí todavía
    fun a() {
        println("A")
    }

    a() // Aquí sí puedes usar a() porque está definida en el mismo bloque
    b() // Función definida fuera, accesible aquí
    c() // Función definida fuera, accesible aquí
    a() // Puedes seguir usando a()
}

fun c() {
    // No puedo usar a() aquí porque a() solo existe dentro de main()
    println("This is function c")
}

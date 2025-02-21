// Definir la clase Student con sus propiedades
data class Student(val fullName: String, val id: Int, var grade: Double)

// Crear una lista de estudiantes
val students =
        listOf(
                Student("John", 223, 140.0),
                Student("Mark", 548, 120.0),
                Student("Natali", 342, 150.0),
                Student("Sara", 781, 130.0)
        )

fun main() {
    // Solicitar el ID del estudiante
    println("Please, Enter the student's ID")

    val id =
            try {
                readln().toInt() // Intentamos convertir la entrada a un número entero
            } catch (e: NumberFormatException) {
                println("Error: Invalid ID. Please enter a valid number.")
                return // Si hay error, terminamos la ejecución
            }

    // Buscar estudiante por ID
    val studentById = getStudentById(id)
    if (studentById != null) {
        println("Student found: $studentById")
    } else {
        println("Error: Student with ID $id not found.")
    }

    // Solicitar el nombre del estudiante
    println("Please, Enter the student's name")
    val name = readln()

    // Buscar estudiante por nombre
    val studentByName = searchInStudents(name)
    println(studentByName ?: "The student is not found")
}

// Función para obtener un estudiante por ID
fun getStudentById(id: Int): Student? {
    return students.find { it.id == id } // Se devuelve null si no se encuentra
}

// Función para buscar un estudiante por nombre
fun searchInStudents(name: String): Student? {
    return students.find { it.fullName.equals(name, ignoreCase = true) }
}

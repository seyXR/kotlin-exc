class Employee(val name: String, val position: String) {
    var label: String = "$name ($position)"
}

fun main() {
    val employee1 = Employee("John", "Manager")
    val employee2 = Employee("Bob", "Writer")
    val employee3 = Employee("Alex", "Producer")
    val employee4 = Employee("Angel", "Creative Director")

    println("Employee: ${employee1.name}, Position: ${employee1.position}")
    println("Employee: ${employee2.label}")
    println("Employee: ${employee3.name}, Position: ${employee3.position}")
    println("Employee: ${employee4.label}")

    println("More on properties and primary constructor")
}

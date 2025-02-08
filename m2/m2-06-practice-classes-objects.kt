//// More on properties and primary constructor

class Grade(val points: Int, val studentId: Int, val topicId: Int)

class Student(
        val id: Int,
        val name: String,
        val surname: String,
)

class Subject(
        val name: String,
        val teacher: Teacher,
        val isObligatory: Boolean,
)

class Teacher(
        val name: String,
        val surname: String,
        val birthday: String,
        val status: String,
)

fun main() {
    // I use named arguments convention here
    val remigiuszFrost =
            Teacher(
                    name = "Remigiusz",
                    surname = "Frost",
                    birthday = "23.07.1987",
                    status = "ACTIVE"
            )
    val biology1 = Subject(name = "Biology 1", teacher = remigiuszFrost, isObligatory = true)
    println("Is this class obligatory: " + biology1.isObligatory) // true
    println("Birthday's teacher: " + biology1.teacher.birthday) // 23.07.1987
    println("Teacher status: " + biology1.teacher.status) // ACTIVE
}

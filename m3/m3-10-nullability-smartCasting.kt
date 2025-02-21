var a: String? = null

fun main() {
    a = "Sam"
    if (a != null) {
        println(a.length) // COMPILATION ERROR, smart-casting not allowed
    }
}

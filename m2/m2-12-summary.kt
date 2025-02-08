fun a() {
    print("A")
}

fun b() {
    print("B")
    a()
}

fun c() {
    b()
    print("C")
    b()
}

fun main() {
    c()
}

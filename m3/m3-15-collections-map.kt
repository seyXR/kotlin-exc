fun main() {
    val map = mapOf('A' to "Alex", 'B' to "Bob")
    for (entry in map) {
        println("${entry.key} is for ${entry.value}")
    }
    val map1 = mapOf('A' to "Alex", 'B' to "Bob")
    val map2 = map1 + ('C' to "Celina")
    println(map1) // {A=Alex, B=Bob}
    println(map2) // {A=Alex, B=Bob, C=Celina}
    val map3 = mapOf('D' to "Daniel", 'E' to "Ellen")
    val map4 = map2 + map3
    println(map3) // {D=Daniel, E=Ellen}
    println(map4) // {A=Alex, B=Bob, C=Celina, D=Daniel, E=Ellen}
}

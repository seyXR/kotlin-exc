fun main() {
    val myHelloString = "Hello"
    val myHelloWorldString = myHelloString + " World"
    println(myHelloWorldString)
    val myChar: Char = 'a'
    println("My Character " + myChar)
    val myStringHello = """Hello
    This is a String. 
    It is on multiple lines. 
    """
    println(myStringHello)
    var age = 70
    var myString = "My age is $age"
    println(myString)
    myString = myChar.toString()
    println("myString = " + myString)

    // String interpolation
    println("String interpolation")
    var s1 = "Hello"
    val s2 = s1 // s1 and s2 now point at the same string - "Hello"
    println(s1) // prints "Hello"
    println(s2) // prints "Hello"
    s1 += "world" // append "world" to s1
    println(s1) // prints "Hello world"
    println(s2)
    // still prints "Hello" because s2 still points to the String "Hello" while s1 is a new String
    // object

    println("Checking the length of a String")
    val myStringLenght = "Hello"
    println("My string lenght is " + myStringLenght.length)
    val startsWithHel = myStringLenght.startsWith("Hel")
    println("Starts with Hel = " + startsWithHel)
    val endsWithLo = myStringLenght.endsWith("lo")
    println("Ends with lo = " + endsWithLo)
    val firstChar = myStringLenght.first()
    println("First character = " + firstChar)
    val lastChar = myStringLenght.last()
    println("Last character = " + lastChar)
    val upperString = myStringLenght.uppercase()
    println("Upper case = " + upperString)
    val lowerString = myStringLenght.lowercase()
    println("Lower case = " + lowerString)
    val subString = myStringLenght.substring(1)
    println("Substring = " + subString)
}

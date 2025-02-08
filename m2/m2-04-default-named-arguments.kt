fun openBrowser(url: String, incognitoMode: Boolean = false) {
    println("Opening $url" + if (incognitoMode) " in incognito mode" else "")
}

fun cheer(how: String = "Hello, ", who: String = "World") {
    print("$how $who")
}

// Usage

fun main() {

    openBrowser("website1.com", false) // Opening website1.com
    openBrowser("website2.com", false) // Opening website2.com
    openBrowser("website3.com", true) // Opening website3.com in incognito mode

    println("strings")
    cheer(how = "Hi ") // Hi World
    cheer(who = "Learner") // Hello, Learner
    cheer(how = "Hi ", who = "Learner") // Hi Learner
    cheer(who = "Learner", how = "Hi ") // Hi Learner
}

fun pay(amount: Double, method: PaymentMethod): Boolean {
    return when (method) {
        PaymentMethod.CASH -> payWithCash(amount)
        PaymentMethod.CARD -> payWithCard(amount)
        PaymentMethod.CHECK -> payWithCheck(amount)
        else -> {
            println("Unknown payment method")
            false
        }
    }
}

enum class PaymentMethod {
    CASH,
    CARD,
    CHECK
}

fun main() {
    // enum
    val success = pay(123.0, PaymentMethod.CHECK)
    println("Success: $success")
}

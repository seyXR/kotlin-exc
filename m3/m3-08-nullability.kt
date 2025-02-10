// Defining a null value
var message: String? = "Hello World"

message = null // Assign null to the variable

var length = message.length // Will cause a Null Pointer Exception

// Safe call
var messageHW: String? = "Hello World"

print(messageHW?.uppercase()) // Will print HELLO WORLD

messageHW = null // Assign null to the variable

print(messageHW?.uppercase()) // Will print null

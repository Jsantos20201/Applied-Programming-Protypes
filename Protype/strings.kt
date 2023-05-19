fun main() {
    // String declaration and initialization
    val message: String = "Hello, Kotlin!"

    // String concatenation
    val name: String = "John"
    val greeting: String = "Welcome, $name"

    // String interpolation
    val age: Int = 25
    val interpolatedString: String = "My age is $age"

    // String length
    val length: Int = message.length

    // Accessing characters in a string
    val firstChar: Char = message[0]
    val lastChar: Char = message[message.length - 1]

    // Substring extraction
    val subString: String = message.substring(7)

    // String comparison
    val str1: String = "apple"
    val str2: String = "banana"
    val areEqual: Boolean = str1 == str2

    // String manipulation
    val upperCase: String = message.toUpperCase()
    val lowerCase: String = message.toLowerCase()

    // String splitting
    val sentence: String = "This is a sample sentence"
    val words: List<String> = sentence.split(" ")

    // Output
    println("Message: $message")
    println("Greeting: $greeting")
    println("Interpolated String: $interpolatedString")
    println("Length: $length")
    println("First Character: $firstChar")
    println("Last Character: $lastChar")
    println("Substring: $subString")
    println("Are Equal: $areEqual")
    println("Uppercase: $upperCase")
    println("Lowercase: $lowerCase")
    println("Words: $words")
}

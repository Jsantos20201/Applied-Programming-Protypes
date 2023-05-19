import java.io.File

fun main() {
    val fileName = "test.txt"

    try {
        val file = File(fileName)

        if (file.exists()) {
            val content = file.readText()
            println("File Content:\n$content")
        } else {
            println("File not found: $fileName")
        }
    } catch (e: Exception) {
        println("An error occurred while reading the file: ${e.message}")
    }
}

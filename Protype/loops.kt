fun main() {
    // For loop
    println("For Loop:")
    for (i in 1..5) {
        println(i)
    }

    // While loop
    println("While Loop:")
    var j = 1
    while (j <= 5) {
        println(j)
        j++
    }

    // Do-while loop
    println("Do-While Loop:")
    var k = 1
    do {
        println(k)
        k++
    } while (k <= 5)

    // Break and continue statements
    println("Break and Continue:")
    for (m in 1..10) {
        if (m == 3) {
            continue  // Skip the rest of the loop body for this iteration
        }
        if (m == 8) {
            break  // Exit the loop completely
        }
        println(m)
    }
}

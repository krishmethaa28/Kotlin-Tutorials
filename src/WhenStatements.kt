//When statements in Kotlin are like Switch statements in Java just without break

fun main() {
    val num1 : Int = 3

    val value = when(num1){

        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        else -> "Please enter a default value"
    }

    println("The value is $value ")
}
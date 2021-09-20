//When statements in Kotlin are like Switch statements in Java just without break

fun main() {
    val num1 : Int = 3

    when(num1){

        1 -> println("It is a One")
        2 -> println("It is a Two")
        3 -> println("It is a Three")
        else -> println("Please enter a default value")
    }
}
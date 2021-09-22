import java.util.*

fun main() {
    val person = TreeMap <String,Int>()

    person["Krishme"] = 23
    person["Kitty"] = 11

    for ((name, age) in person){
        println("The age of $name is $age")
    }
}
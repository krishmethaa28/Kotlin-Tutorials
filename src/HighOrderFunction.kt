import java.util.function.Consumer

fun main() {

    var values = listOf<Int>(1,2,3,4,5,6)
    println("Numbers: ")

//Method 1
    var con : Consumer<Int> = object : Consumer<Int>{
        override fun accept(t: Int) {
            print(t)
        }

    }

    values.forEach(con)
    println()

//Method 2

    values.forEach { print(it) }  //Function inside function

    println()
//Method 3
    values.forEach(::print)

}
//The null pointer exceptions are handled very easily
//Unlike in Java, no need to specify the exception, adding a question mark near the variable is enough in Kotlin

fun main() {
    var str1 : String? = null

    println("The value of str1 is $str1")

    var person1 : Person? = Person()
    person1 = null

    println("The value of name is $person1")

    println("The length of name is ${person1?.name?.length}")
}
import java.math.BigInteger

fun main() {

    val number : Int = 5
    println("Factorial of $number is ${factorial(number)}")   //5! = 5 * 4 * 3 * 2 * 1

    val number1 = BigInteger("50")
    println("Factorial of $number1 is ${factorial(number1)}")


}

fun factorial(number: Int) : Int{
    if (number == 0)
        return 1
    else
        return number * factorial(number - 1)
}

//Factorial of big numbers are too large so can't use integer
fun factorial (number: BigInteger) : BigInteger{
    if (number == BigInteger.ZERO)  //0 and 1 are way to0 small to compare with big integer
        return BigInteger.ONE
    else
        return number * factorial(number - BigInteger.ONE)
}
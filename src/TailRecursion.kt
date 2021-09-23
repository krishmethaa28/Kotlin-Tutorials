import java.math.BigInteger

fun main() {
    val number = BigInteger("70000")
    println("Factorial of $number is ${factorial(number, BigInteger.ONE)}")

}

tailrec fun factorial(number : BigInteger, result: BigInteger) : BigInteger{
    if (number == BigInteger.ZERO)
        return result
    else
        return factorial(number- BigInteger.ONE,number*result)

}
@file:JvmName("Parameters")

fun main() {

    var finalAmount = calcAmount(50)
    println("Amount Due with regular tax : Rs.$finalAmount")

    finalAmount = calcAmount(100,0.03)
    println("Amount Due with special tax : Rs.$finalAmount")

}

@JvmOverloads  //same method used for default and parameterized method to call in java
fun calcAmount(amt : Int, interest : Double = 0.05) : Int {
    return (amt + amt * interest).toInt()
}
//change class name MethodsKt --> Methods
@file:JvmName("Methods")


fun main() {

    println("Add(2,3) : " + add(2,3))
    println("Add(7,2) : " + addNum(7,2))
    println("Max(6,4) : " + max(6,4))
    println("Max(2,3) : " + maxNum(2,3))
}

//add two numbers
fun add(a : Int, b : Int) : Int{
    return a + b
}

//add function in one line
fun addNum(a : Int, b : Int) : Int = (a + b)

//find max
fun max(a : Int, b : Int) : Int{
    return if (a>b)
        a
    else
        b

}

//find max in one line
fun maxNum(a: Int, b: Int) : Int = if (a>b) a else b
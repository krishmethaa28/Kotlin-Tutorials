fun main() {

    var values = mutableListOf<Int>(10,30,40,50,60)  //two types of list --> mutable & listOf
    values.add(70)
    values.add(1,20)

    for (i in values)
        print("$i ")

    println()
    println("Last : ${values.last()}")
    println("Size :  ${values.size}")
}
fun main() {

    var number = intArrayOf(10,20,30,40,50)
//replace values
    number[1] = 15
    number.set(0,5)

//fetch values
    println("Index 3 : ${number[3]}")
    println("Index 4 : ${number.get(4)}")


//print values
    println("Array Elements :")
    for (i in number){
        print("$i ")
    }

    println()

//last value & size
    println("Last : ${number.last()}")
    println("Size : ${number.size}")

//initialise array
    var string = arrayOfNulls<String>(2)
    string.set(0,"Krish")
    string.set(1,"Kitty")

    for (i in string)
        print("$i ")
}
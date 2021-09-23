fun main() {

    val string : String = "4a"

//method : 1
    var number: Int
    try {
        number = string.toInt()
        println("Number = $number")

    }catch (e : Exception){
        println("Give a proper input!!!")
    }


//method : 2

    number = try {
        string.toInt()

    }catch (e : Exception){
        -1
    }

    println("Number = $number")


}
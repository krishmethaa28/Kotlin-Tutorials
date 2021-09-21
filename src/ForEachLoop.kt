
fun main(){
    val num = 1..10  //range (1-10)

    println("Numbers in range from 1 - 10: ")
    for(a in num){
        print("$a ")
    }

    println("\n")

//count ++2
    println("Numbers in range from 1 - 10 skipping 2: ")
    for(a in num step 2){
        print("$a ")
    }

    println("\n")

//print in reversed order
    println("Numbers in range from 16 - 1 : ")
    val num1 = 16 downTo 1
    for(a in num1){
        print("$a ")
    }

    println("\n")

//print ignoring the last number
    println("Numbers in range from 1 - 15 : ")
    val num2 = 1 until 16
    for(a in num2){
        print("$a ")
    }

    println("\n")

//print in reverse ignoring the last number
    println("Numbers in range from 15 - 1 : ")
    for(a in num2.reversed()){
        print("$a ")
    }

    println("\n")

//print characters in a range
    println("Characters in range from A - z : ")
    val char = 'A'..'z'
    for(a in char){
        print("$a ")
    }

    println("")
    println("Count of characters ${char.count()}")




}

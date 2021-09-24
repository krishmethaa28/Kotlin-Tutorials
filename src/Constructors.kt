
//Primary Constructor
class Human (var n : String){
    var name : String = ""

//init block is used to do operations inside constructors
    init {
        name = n
        println("The owner name is assigned as : $name.")

    }

    fun think(){
        println("$name has a pet.")
    }
}

class Animal (var noOfLimbs : Int) {

    var limbs : Int = noOfLimbs
    var eyes : Int = 0

 //Secondary Constructor
    constructor(limbs : Int, eyes : Int) : this(limbs) {
        this.eyes = eyes
    }

    fun walk(){
        println("The pet has $limbs limbs and $eyes eyes.")
    }
}

fun main() {

//Class Human
    var human = Human("Hrithik")
    human.think()

//Class Animal
    var animal = Animal(4,2)
    animal.walk()

}
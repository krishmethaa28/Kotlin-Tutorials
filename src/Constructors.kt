
//Primary Constructor
class Human (var n : String){
    var name : String = n

    fun think(){
        println("$name can think well")
    }
}

class Animal{
    var limbs : Int = 0

    fun walk(){
        println("I have 04 limbs")
    }
}

fun main() {

//Class Human
    var human = Human("Hrithik")
    human.think()

//Class Animal
    var animal = Animal()
    animal.walk()

}
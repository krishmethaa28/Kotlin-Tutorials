
//inherit class
//By default all the classes and functions in Kotlin are Final, open keyword allows for inheritance.... (No multiple inheritance)
open class Parent{
//override function
    open fun work(){
        println("Parent : I am a parent class")
    }
}

class Child : Parent(){

    override fun work(){
        println("Child : I am a child class")
    }
}

fun main() {

    var father : Parent = Child()  // child object with parent class type...
    father.work()
}
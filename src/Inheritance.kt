
//inherit class
//By default all the classes and functions in Kotlin are Final, open keyword allows for inheritance.... (No multiple inheritance)
open class Parent(age: Int) {

    init {
        println("Parent constructor : age passed from child class --> $age")
    }

//override function
    open fun work(){
        println("Parent : I am a parent class")
    }
}

class Child(age : Int) : Parent(age){

    init {
        println("Child constructor")
    }

    override fun work(){
        println("Child : I am a child class")
    }
}

fun main() {

    var father : Parent = Child(23)  // child object with parent class type...
    father.work()
}
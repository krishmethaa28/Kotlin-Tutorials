/** Kotlin do not use getters and setters*/

class Person {

    var name : String = ""
    var age : Int = 0
}

fun main(args: Array<String>){

//create an object
    val person1 = Person() //constants {final in Java}
    //Person person1 = new Person();

    person1.name = "Krishme"
    //person1.setName = "Krishme";

    person1.age = 23
    //person1.setAge = 23;

    print("The name of the person is ${person1.name},\nThe age is ${person1.age}...")

}



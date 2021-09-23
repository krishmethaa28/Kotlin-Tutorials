import kotlin.concurrent.timer

fun main() {

 //object 1
    var alien1 = Alien()
    alien1.skills = "Java"
    alien1.show()

 //object 2
    var alien2 = Alien()
    alien2.skills = "Kotlin"
    alien2.show()

 //object 3
    var alien3 = Alien()
    alien3 = alien1.plus(alien2)
    alien3.show()

    //object 4
    var alien4 = Alien()
    alien4.skills = "Python"
    alien4.show()

 //object 5
    var alien5 = Alien()
    alien5 = alien3 plus alien4 // Using infix to avoid brackets
    alien5.show()

 //object 6
    var alien6 = Alien()
    alien6 = alien4 + alien3 // operator overloading using operator keyword
    alien6.show()

}

//Extended Functions
infix operator fun Alien.plus(a : Alien) : Alien{
    var newAlien = Alien()
    newAlien.skills = this.skills + ", " + a.skills
    return newAlien

}
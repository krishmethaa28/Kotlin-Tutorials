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

}

//Extended Functions
fun Alien.plus(a : Alien) : Alien{
    var newAlien = Alien()
    newAlien.skills = this.skills + ", " + a.skills
    return newAlien

}
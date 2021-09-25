//Abstract class
abstract class SportsClub{

    //abstract method
    abstract fun sport()

    fun location(){
        println("location : SportsClub ")
    }
}

class FootballClub : SportsClub(){

    override fun sport() {
        println("Sport : Football")
    }

}

fun main() {
    var england : SportsClub = FootballClub()
    england.sport()
    england.location()


}
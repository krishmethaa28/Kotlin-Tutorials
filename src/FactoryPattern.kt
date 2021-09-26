class D{

    companion object{
        fun create() : D = D()   //returning an Object of the class, reduces complexity of creating class objects...
    }

    fun show(){
        println("Show Of!!!")
    }
}

fun main() {

    val variable : D = D.create()
    variable.show()
}
interface A{

    fun show()

    fun receive(){
       println("Gift from interface A")
    }

    fun message(){
        println("Message from Interface A")
    }
}

interface B{

    fun display()

    fun message(){
        println("Message from Interface B")
    }
}

class C : A, B {

    override fun show() {
        println("I am from interface A")
    }

    override fun display() {
       println("I am from interface B")
    }

//solve multiple inheritance of ambiguity
    override fun message(){
    println("Multiple inheritance")
    super<A>.message()
    super<B>.message()

    println("Message from Class C")


    }


}

fun main() {
    var variable = C()
    variable.show()
    variable.display()
    variable.receive()
    variable.message()
}
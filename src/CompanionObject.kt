class Program{
    companion object{
        @JvmStatic   //making a method static
        fun show(){
            println("I am writing a program")
        }
    }
}

fun main() {
    Program.show()
}
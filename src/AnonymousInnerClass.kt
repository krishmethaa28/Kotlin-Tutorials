fun main() {

    var programmer : Sports = object : Sports   //create only one single instance --> object
                            {
                              override fun play(){
                                  println("Hi, You can play your favourite sport...")
                              }

                            }

    programmer.play()

}

interface Sports{

    fun play()

}
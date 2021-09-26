//ToString method
//Equals & HashCode
//Copy / clone method
//single keyword --> data

data class Laptop(val brand : String, val price : Int){

}

fun main() {

    val laptop1 = Laptop("Hp",2000)
    val laptop2 = Laptop("Acer",1750)

/**In need of toString method*/
    println("Laptop 1 : $laptop1")
    println("Laptop 2 : $laptop2")

/**In need of Equals & HashCode*/
    println("Is laptop1 & laptop2 ? ${laptop1 == laptop2}")

/**In need of copy method*/
    val laptop3 = laptop1.copy()
    println("Is laptop1 & laptop3 ? ${laptop1 == laptop3}")

    val laptop4 = laptop2.copy(price = 2300)
    println("Laptop 4 : $laptop4")


}
fun main() {
    val num = listOf<Int>(1,2,3,4,5)

    for ((i,e) in num.withIndex()){
        println("Index $i : $e")
    }
}
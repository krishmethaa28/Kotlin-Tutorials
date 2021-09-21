
fun main(){
    val num = 1..10  //range (1-10)

    for(a in num){
        print(a)
    }

    println()

    //count ++2
    for(a in num step 2){
        print(a)
    }
    
}

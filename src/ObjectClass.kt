
data class Book(var name : String, var price : Int)   //no method body

//singleton object, no need to create a separate object
//the class itself an object
object BookShelf{

    var books = arrayListOf<Book>()

    fun showBooks(){
        for (i in books){
            println(i)
        }
    }
}

fun main() {

    BookShelf.books.add(Book("Java",60))
    BookShelf.books.add(Book("Python",50))
    BookShelf.books.add(Book("Kotlin",80))
    BookShelf.books.add(Book("C#",70))

    BookShelf.showBooks()
}
fun main() {

    var values = mutableListOf<Int>(10,30,40,50,60)  //two types of list --> mutable & listOf
    values.add(70)
    values.add(1,20)

    for (i in values)
        print("$i ")

    println()
    println("Last : ${values.last()}")
    println("Size :  ${values.size}")

    println("-----------------------------------------------------------------------------------------------------------------------")

    var student : List<Student> = listOf<Student>(Student("Shadu",99),Student("Kitty",99))

    for (student in student)
        print("${student.name} - ${student.marks} ")
}

data class Student (var name : String, var marks: Int)
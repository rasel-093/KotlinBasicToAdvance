data class Student(
    var id : Int?,
    var name : String?,
    var cg : Double?
)
fun getStudentById(id:Int) : Student?{
    var student : Student = Student(null,null,null)
    for (it in listOfStudent){
        if (it.id == id) {
            student = it
            break
        }
    }
    return  student
}
fun  searchInStudents(name : String) : Student?{
    var student : Student = Student(null,null,null)
    for (it in listOfStudent){
        if (it.name?.lowercase()  == name?.lowercase()) {
            student = it
            break
        }
    }
    return student
}
    var Std1 = Student(10,"Rasel", 3.5)
    var Std2 = Student(11,"Shezan", 3.7)
    var Std3 = Student(12,"Niloy", 3.6)
    var Std4 = Student(13,"Toufique", 3.3)
    var Std5 = Student(14,"Shahriar", 3.2)
    var Std6 = Student(15,"Tanzid", 3.1)
    val listOfStudent = listOf<Student>(Std1,Std2,Std3,Std4,Std5,Std6)

fun main()
{
    println("Please, enter the id of the student :")
    val id: Int= readln().toInt()
    println( getStudentById(id))

    println("Please, enter the Name of the student :")
    val Name: String= readln().toString()
    println(searchInStudents(Name) ?: "The student is not found")
}
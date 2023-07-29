class Subject(
    val name: String,
    val teacher: Teacher,
    val isObligatory: Boolean,
)

class Teacher(
    val name: String,
    val surname: String,
    val birthday: String,
    val status: String,
){
    fun printTeacherInfo()
    {
        println(name)
        println(surname)
        println(birthday)

    }
}


fun main() {
    // I use named arguments convention here
    val Teacher1 =
        Teacher(name = "Remigiusz", surname = "Frost", birthday = "23.07.1987", status = "ACTIVE")
    val biology1 = Subject(name = "Biology 1", teacher = Teacher1, isObligatory = true)
//    println(biology1.isObligatory) // true
//    println(biology1.teacher.birthday) // 23.07.1987
//    println(biology1.teacher.status) // ACTIVE
    Teacher1.printTeacherInfo()
}

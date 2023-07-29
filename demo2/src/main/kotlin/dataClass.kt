//fun main() {
//    println("A" == "A") // true
//    println("A" == "B") // false
//}

 data class A(
    val name: String,
    val id : Int
)
fun main()
{
    val obj1 : A = A("Chair", 32)
    val obj2 : A = A("Chair", 35)
    val obj3 : A = A("Chair", 32)

    println(obj1 == obj1)  //true
    println(obj1 == obj2)   //false
    println(obj1 == obj3)   //true // if the main class is not a data class then this line will print false
    //When class A is data class
    println(obj1) //A(name=Chair, id=32)
    println(obj2) //A(name=Chair, id=35)
    println(obj3) // A(name=Chair, id=32)

    //When class A is not data class
    println(obj1) //A@2f4d3709
    println(obj2) //A@4e50df2e
    println(obj3) // A@1d81eb93
    //when class A is a data class
    println("$obj1")
    println("$obj2")
    println("$obj3")
    // Data classes can be destructured,
    // which means reading values from this class and assigning them to variables.
    val(Chair, id) = obj1  //Variable order is important here
    println(Chair)
    println(id)
    // data classes have a copy method, that creates a copy of an object taking a little modification.
    println(obj1.copy()) //A(name=Chair, id=32)
    println(obj2.copy(id = 45)) // A(name=Chair, id=45)
    println(obj3.copy(name = "Bed")) //A(name=Bed, id=32)

    //built in pair class
    val pair = 1.0 to 'A'
    println(pair.first) // 1.0
    println(pair.second) // A
    val (number, letter) = pair
    // the type of number is Double
     // the type of letter is Char
    println(number) // 1.0
    println(letter) // A

    //built in tripple class
    val pair2 = Triple(1F, "ABC", true)
    println(pair2.first) // 1.0
    println(pair2.second) // ABC
    println(pair2.third) // true
    val (number2, letters2, boolean) = pair2
   // the type of number is Double
    // the type of letters is Char
    // the type of boolean is Boolean
    println(number2) // 1.0
    println(letters2) // ABC
    println(boolean) // true

}
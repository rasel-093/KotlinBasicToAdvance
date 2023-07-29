//var name: String = null // This is wrong.If we want to store null type we have to define variable as nullable
//var name: String? = null // This line now accepts both null and string

//class A{
//    var name : String = "Rasel"
//}
//fun main()
//{
//    var obj1 : A? = null
//
//}
//class  User{
//    var name : String = "Rasel"
//}
//fun test(var a: Int?){
//    return null
//}
//fun main(){
//    var obj1 : User? = null
//    test(null)
//}

//fun main()
//{
//     var msg : String? = "Hello world!"
//     println(msg)
//     msg = null
//     println(msg)
//     if(msg!=null)
//     	 {
//              var length: Int = msg.length
//              println(length)
//          }
//     else println("null")
//}
//Safe call
//fun main()
//{
//    var msg : String? = "Hello world"
//    println(msg)
//    msg = null
//    println(msg?.length) // This statement can print both actual length or null. This is called 'safe call'
//    println(msg?.uppercase())
//}
class User(val name : String?){
    fun cheer(){
        println("hello, my name is $name")
    }
}
//fun printUserName(user : User?){
//    println(user?.name)
//    user?.cheer()
//}

fun printUserName(user : User?){
    // null value can be handled using if else
    // null value can be handled using alvis operator ?:
    // if user is not null then left side will be execute and if null then right side will be executed
        val userWithDefault : User = user ?: User("Unknown")
    println(userWithDefault.name)
}
fun main()
{
   // printUserName(User("Rasel"))
    println("***")
    printUserName(null)
    printUserName(User("Rasel"))
}
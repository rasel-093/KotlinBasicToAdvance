//import java.lang.NumberFormatException
//
//fun main()
//{
//    val a: Int = 10
//    val b: Int = 5
//    var div: Double
//    try {
//        div = (a/b).toDouble()
//        println(div)
//    }
//    catch (exception : NumberFormatException){
//        println(exception.message)
//    }
//    catch (exception : ArithmeticException){
//        println(exception.message)
//    }
//    catch (exception : Throwable){
//        println(exception.message)
//    }
//    //All the exceptions are subclass of Throwable
//}
// Any class that extends Throwable can be used as an exception.
// That means it can be thrown using a throw block.
//class MyError: Throwable("Some message")
//
//fun someFunction() {
//    throw MyError()  //throw Throwable and throw MyError() are same coz MyError extends Throwable class
//    println("Will not be printed")
//}
//
//fun main() {
//    try {
//        someFunction()
//        println("Will not be printed")
//        } catch (e: Throwable) {
//        println("Caught $e") // Caught MyError: Some message
//         }
//}
// There is the finally block that is invoked even if an exception occurs.
// It doesn't matter try block executes or not, finally block always executes
//fun someFunction() {
//    throw Throwable("Some error")
//    println("Will not be printed")
//}
//
//fun main() {
//     try {
//        someFunction()
//        println("Will not be printed")
//         } finally {
//        println("Finally block was called") // Finally block was called
//         }
//    println("Will not be printed")
//}

//fun someFunction() {
//    println("Will be printed") // Will be printed
//}
//
//fun main() {
//     try {
//        someFunction()
//        println("Will be printed") // Will be printed
//         } finally {
//        println("Finally block was called") // Finally block was called
//         }
//    println("Will be printed") // Will be printed
//}
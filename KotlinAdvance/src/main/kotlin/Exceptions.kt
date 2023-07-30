
fun main(){
   // val input = readLine()?.toInt()
    //For above input statement if we enter any character that is not a number
    //then kotlin throws an error named "NumberFormatException" and program crashes
    //To overcome we use try catch block
    val input = try {
        readLine()?.toInt()
        println("try block executed")
    }catch (e : NumberFormatException){ // NumberFormatException is a child class of Exception
        println("catch block executed")
        0
    }finally {
        println("Finally block which is always executed")
    }
    println(input)
    //Custom Exception
    val a = 10.0
    val b = 0.0
    try {
        println("${divide(a,b)}")
    }catch (e:DivisionByZeroException){
        println(e.message)
    }

}

//Creating own exception
class DivisionByZeroException() : Exception("Can not divide by zero")
fun divide(a : Double, b : Double){
    if(b == 0.0){
        throw DivisionByZeroException()
    }
}
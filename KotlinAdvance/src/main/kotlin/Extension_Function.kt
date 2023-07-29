
fun main(){
    println("Enter a number")
    var input = readLine()?.toInt()
    while (input != 0){
        if(input != null){
            if(input.isPrime()){
                println("$input is a prime number")
            }
            else println("$input is not a prime number")
        }
        input = readLine()?.toInt()
    }
}
fun Int.isPrime() : Boolean{
    for(i in 2 until this-1){
        if(this % i == 0){
            return false
        }
    }
    return  true
}
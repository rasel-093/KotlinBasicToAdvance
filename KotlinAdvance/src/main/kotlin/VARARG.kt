
fun main(){
    val array = intArrayOf(60,40,100)
    val max = getMax(1,2,3,6,*array,10,50,23,34)
    println("Max is : ${max}")
}

fun getMax(vararg numbers:Int) : Int{
    var max = numbers[0]
    for (number in numbers){
        if (max<number) max = number
    }
    return max
}
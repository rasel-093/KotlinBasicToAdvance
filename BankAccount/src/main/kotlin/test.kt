fun main()
{
    val test : Int = readln().toInt()
    for(i in 1..test){
        val a :Int = readln().toInt()
        val b : Int = readln().toInt()
        val c : Int = readln().toInt()
        if((a+b) == c)
            println("+")
        else
            println("-")
    }
}
fun absolute(value:Int):Int = if (value >= 0) value else -value
fun main()
{
    //Function
//    fun triangleArea(width: Double, height: Double): Double {
//        return width * height / 2
//    }
//
//    fun biggerOf1(a: Int, b: Int): Int {
//        return if (a > b) a else b
//    }
//
//    fun biggerOf2(a: Int, b: Int): Int = if (a > b) a else b
//  println(absolute(-10))
//    println(absolute(32))
//    println(absolute(-32))

  //Default Arguments
  fun openBrowser(url: String, incognitoMode: Boolean = false) {

    println("Opening $url" + if (incognitoMode) " in incognito mode" else "")

    // ...

  }

// Usage

  fun main() {

    openBrowser("website1.com") // Opening website1.com

    openBrowser("website2.com") // Opening website2.com

    openBrowser("website3.com", true) // Opening website3.com in incognito mode
  }
}
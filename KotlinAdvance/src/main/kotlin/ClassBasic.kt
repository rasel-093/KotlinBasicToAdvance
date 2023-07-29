import java.awt.geom.Area

fun main(){
    val rectangle1:Rectangle = Rectangle(5.0,2.0)
    val rectangle2 = Rectangle(7.5,3.6)
    println("Area is : ${rectangle1.Area()}")
    println("Perimeter is : ${rectangle1.Perimeter()}")

    val circle1 = Circle(7.5)
    println("Details of Circle 1 : ")
    circle1.Print()
}

class Rectangle(
    val length: Double,
    val width : Double
){
    //init block is executed while creating object
    init {
        println("Reactangle object is created")
    }
    fun Area() = length*width
    fun Perimeter() = 2*(length + width)
}

class Circle(
    val radius : Double
){
    val pi = 3.14159
    init {
        println("Circle object is created")
    }
    fun Area() = pi*radius*radius
    fun Perimeter() = 2*pi*radius
    fun Print() = println("Radius = $radius\n Area = ${Area()} \n Perimeter = ${Perimeter()}")
}
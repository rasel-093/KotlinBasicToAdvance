import kotlin.random.Random

//Any object defined using object keyword and having no class is called singleton
fun main(){
    //We can directly access to object attribute
    println(ColorValue.pi)
    println(ColorValue.a)
    println(ColorValue.b)
    //Companion object
    val circle = Circle1.randomCircle()
    // circle.randomCircle() is wrong statement
    //randomCircle() is a companion object . Can be accessed by a dot following class name.
    println("Radius of circle = ${circle.radius}")
}

//Here ColorValue is an object.Class of the object is created instantly
object ColorValue{
    val pi = 3.14159
    val a = 5.0
    val b = 50
}
class Circle1(
    val radius : Double
){
    companion object{
        fun randomCircle() : Circle{
            val radius = Random.nextDouble(2.0,10.0)
            return Circle(radius)
        }
    }
}

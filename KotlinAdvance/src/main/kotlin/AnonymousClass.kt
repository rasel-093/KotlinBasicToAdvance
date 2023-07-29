import java.awt.Shape

//Shape class is super class and abstract class. We can't create
//object of abstract class. But here we will use abstract class as anonymous class

fun main(){

    //Here animal is a temporary object which is called anonymous object

    val animal = object : Animal("Atu3",4) {
        init {
            println("Animal created with name : ${name} and $age")
        }
        override fun eat() {
            println("Animal eats grass, fish, insects etc")
        }

    }
    println(animal.name)
    println(animal.age)
    println(animal.eat())
}
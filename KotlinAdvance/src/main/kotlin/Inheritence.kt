fun main(){
    //Creating object
    val dog = Dog("Atu",3,"Labrador")
    val cat = Cat("Choko",2,"White")
    //Accessing variable and function for dog
    dog.makeSound()
    println( "${dog.age}")
    println("${dog.breed}")
    dog.bark()
    println("Old name = ${dog.name}")
    dog.changeName("New Atu")
    println("New name = ${dog.name}")

    //Accessing variable and functioon for cat
    cat.makeSound()
    println("${cat.color}")
    println("${cat.age}")
    cat.meow()
    println("Old name = ${cat.name}")
    cat.changeName("New Choko") //Change name function can be called for all object
    println("New name = ${cat.name}")
}

abstract class Animal(  //abstract class doesn't have object.To restrict creating object  of susch
    // superclass we use abstract class
    var name : String,
    var age : Int
){
    fun makeSound(){
        println("Animal makes a sound")
    }
    abstract fun eat() //No implemention requires here
                //but abstract class must be overriden and defined in sublcass
        //if we want a common function must be used  by subclass then we define a funtin abstract.
    fun changeName(newName:String){
        name = newName
    }
}
class Cat(
    name: String,
    age: Int,
    val color : String
): Animal(name,age){
    override fun eat() {
        println("Cat eats fish")
    }
    fun meow(){
        println("Meow")
    }
}
class Dog(
    name: String,
    age: Int,
    val breed : String
):Animal(name,age){
    override fun eat() {
        println("Dog eats bones")
    }
    fun bark() = println("woof! woof!")
}
//Constructor - Defining how an Object can be created
// constructor (age:Double):this(age.toInt)
//Function overloading - Functions having same name but different type/number of parameters.

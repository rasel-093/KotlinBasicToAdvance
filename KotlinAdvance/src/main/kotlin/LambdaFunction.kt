
fun main(){
    var list = (1..20).toList()
    println("Primary list : \n $list")
    //list = list.filter { it % 2 == 0 } //here filter{} is a lambda function.Here own definition can be applied
    //list = list.filter { it > 8 }
    list = list.filter { it % 5 == 0 }
    println("List after filter : \n $list")
    //filter function can be applied to custom object
    // var shape = listOf(shape1,shape2,shape3,shape4)
    // shape = shape.filter{ it.area() > 20 } //Here it refers to shape
    //more than one lambda funtion can be applied in a single statement.
    //shape = shape.filter{ it.area() > 20 }.sortedBy{it.area() }
    //shape list will now be sorted according to their area.
    // Here it refers to shape
}

//Creating Custom lambda function
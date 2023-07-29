//Use enum classes whenever you need to define a specific set of values.
//Example
//enum class WeekDay {
//     SUNDAY,
//    MONDAY,
//     TUESDAY,
//     WEDNESDAY,
//     THURSDAY,
//    FRIDAY,
//    SATURDAY
//}
////You could also use an enum class to specify possible pizza sizes:
//enum class PizzaSize {
//     SMALL,
//     MEDIUM,
//     LARGE,
//     EXTRALARGE
//}
//Enum class can also have a constructor. It looks just like a constructor in regular classes,
// but when it is defined, each value needs to call it.
// This mechanism is used to assign values to each enum value.
// For instance, in the pizza sizes example, it could be a size in centimeters.
//enum class PizzaSize(
//    val sizeInCm: Int
//) {
//    SMALL(15),
//    MEDIUM(20),
//    LARGE(25),
//    EXTRALARGE(30)
//}
//
//fun printSize(pizzaSize: PizzaSize) {
//    println("$pizzaSize is ${pizzaSize.sizeInCm} cm")
//}
//
//fun main() {
//    printSize(PizzaSize.MEDIUM) // MEDIUM is 20 cm
//    printSize(PizzaSize.EXTRALARGE) // EXTRALARGE is 30 cm
//}

fun main(){
    val day = Day.Sat
    //println(day)
    //println(day.number)
//    for(day in Day.values()){
//        print(" $day" +
//                "------")
//        println( "Day number = ${day.number}" )
//    }
    for(day in Day.values()){
        day.printDay()
    }
}
enum class Day(val number: Int){
    Sat(1),
    Sun(2),
    Mon(3),
    Tue(4),
    Wed(5),
    Thus(6),
    Friday(0);  //semicolon must be used to define funtion after this values
    fun printDay(){
        println("Today is $this day")
    }
}

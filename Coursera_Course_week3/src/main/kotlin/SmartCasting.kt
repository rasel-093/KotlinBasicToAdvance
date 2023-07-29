//fun consume(a: Any) {
//     if (a is String) {
//        println(a.length) // the type of a is String
//         }
//    if (a is Int) {
//        println(a * 10) // the type of a is Int
//         }
//}
//fun main() {
//     consume("ABC") // 3
//    consume(10) // 100
//    consume("Abc12")
//    consume("345")
//}

//handling null
//fun smartCasting(value : Any?){
//    if(value != null){
//        if(value is String)
//            println(value.length)
//        else if (value is Int)
//            println(value*10)
//    }
//    else
//        println("null can't be handled")
//}
//fun main()
//{
//    smartCasting("Rasel")
//    smartCasting(20)
//    smartCasting(null)
//}

//This portion will  not be compiled
//var a: String? = null
//
//fun main() {
//     a = "Sam"
//    if (a != null) {
//        println(a.length) // COMPILATION ERROR, smart-casting not allowed
//        }
//}
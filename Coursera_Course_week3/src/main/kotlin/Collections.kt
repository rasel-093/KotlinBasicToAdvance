//kotlin collectins are
 // i. list //Elements can occur more than once in a list (immutable)
    // ii. set // Set is a collection of unique elements (immutable
    // iii. map // Map (or dictionary) is a set of key-value pairs

// list // list is read only. We can't modify list but we can create new list
// from previus list
var deptList = listOf<String>(
    "CSE",
    "EEE",
    "ECE",
    "ETE",
    "CE",
    "CE",
    "ME",
    "MTE"
)
var mutableList = mutableListOf<String>(
    "CSE",
    "EEE",
    "ECE",
    "ETE",
    "CE",
    "CE",
    "ME",
    "MTE"
)
fun main(){
//    println("The list is $deptList")
//    println(deptList[4])
//    println(deptList.indexOf("CE")) //only returns index of first occurence
//    println(deptList.size) //how many elements are in the list
    // iteration   in list
//    for(it in deptList){
//        println(it)
//    }
    // Creating new list  from previus list
//    val newDeptList = deptList -"ETE" + "URP" + "GCE" + "MTE"
//    println(newDeptList)
//    println(mutableList)
//    mutableList.add("URP")
//    println(mutableList)
//    mutableList.remove("URP")
//    println(mutableList)
//    val list : List<String> = listOf("A" , "B", "C")
//    val set : Set<String> = setOf("A" , "B" , "C")
//    println(list.isEmpty()) // false
//    println(set.isEmpty()) //false
//    println("A" in list) // true
//    println("D" in set) //false
    //Mutable list
//    val list : MutableList<Int> = mutableListOf(1,2,3,4,5)
//    val set : MutableSet<Int> = mutableSetOf(1,2,3,4,5)
    //Extra function : add, remove, update (indexng)
//    list.add(10)
//    set.add(15)
//    list.remove(2)
//    set.remove(3)
//    println(list)
//    println(set)
//    list[0] = 10
//    list[1] =20
//    list[2] = 30
//    println(list)
    //Set
    //Elements that are already in a set are not added; their addition is just ignored.

//    val set : MutableSet<Int> = mutableSetOf(1,2,3,4,5)
//    set.add(5)
//    set.add(6)
//    println(set) // 5 is ignored
//    println(set + setOf(6,7,8)) //6 is ignored
    //class object in set

//    var setOfA : Set<A> = setOf(A(10),A(11),A(12),A(13))
//    println(setOfA) //All elements are unique in case of class object
    //we can use data class to check equality
//    var setOfA : Set<A> = setOf(A(10),A(11),A(12),A(13),A(10),A(10),A(11))
//    println(setOfA) // only unique object are printed
//    println( setOfA.contains(A(10))) //true
//    println(A(10) in setOfA)
//    println(A(16) !in setOfA)
//    println(A(12) !in setOfA)
    // Map
    //Map represents an unordered collection of key-value pairs
    val mapOfCt : Map<String ,String> = mapOf(
        "USA" to "Washington",
        "Bangladesh" to "Dhaka",
        "Ukrain" to "kyev",
        "Iran" to "Tehran",
        "Russia" to "Mosco",
        "China" to "Beijing",
        "Arab" to "Riyadh"
    )
    val mapOfLetters : Map<Int,Char> = mapOf(
        1 to 'a',
        2 to 'b',
        3 to 'c',
        4 to 'd',
        5 to 'e'
    )
    val dept : Map<Int, String> = mapOf(
        Pair(0,"CE"),
        Pair(1,"ME"),
        Pair(2,"EEE"),
        Pair(3,"CSE")
    )
    println(mapOfCt)
    println(mapOfLetters)
    //Finding a value for a key
    var letter : Char? = mapOfLetters[2]
    println(letter)
    letter  = mapOfLetters[5]
    println(letter)
    letter = mapOfLetters[6]
    println(letter) //returns null
    //Adding elements to a map
    println(mapOfCt + mapOf("India" to "New Delhi"))
    println(mapOfCt + mapOfLetters)
    //Removing elements from a map
    var mapOfCt2 = mapOfCt - "USA"
    println(mapOfCt2)
    //Checking if a map contains a key
    println(3 in mapOfLetters) // true

    //Iterating over maps
    //You can iterate over a map using a for-loop.
     // You iterate over entries that contain key and value properties.
    for(entity in dept){
        println(" ${entity.key} is for ${entity.value}")
    }
    for((code, Dept) in dept){
        println("$code is for $Dept")
    }
    //Mutable map
    val babyreadingMap : MutableMap<Char, String> = mutableMapOf(
        'A' to "Apple",
        'B' to "Ball",
        'C' to "Cat"
    )
    babyreadingMap.put('D',"Doll") //Adding element in map
    babyreadingMap['B'] = "Bat" // Updating an element
    babyreadingMap.remove('A')
    println(babyreadingMap)


}
//class A(var id : Int)
data class A(var id : Int)

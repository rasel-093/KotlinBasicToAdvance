import javax.print.attribute.standard.JobOriginatingUserName

data class  User(var userName:String, var password: String)

fun loginPage() {
    println("Enter username : ")
    var userName: String = readln().toString()
    println("Enter Password: ")
    var password : String = readln().toString()
    var user : User = User(userName,password)
    if(userList.contains(user)){
        println("Congrats! Login successful")
        ActiveUserPage(user)
    }
    else{
        println("Failed")
        Function()
    }
}

fun ActiveUserPage(user : User) {
    println("Welcome ${user.userName}!\n You are now in homepage")
    println("Which laptop do you want to take ? \n Enter laptop no : ")
    var laptopNo : Int = readln().toInt()
    processLaptop(laptopNo)

}

fun processLaptop(laptopNo: Int) {
    println("Processing. wait a while!")
    Thread.sleep(5000L)
    println("Your laptop is ready. Take it from $laptopNo No. box.")
}

fun signUpPage() {
    println("Enter username : ")
    var userName: String = readln().toString()
    println("Enter Password: ")
    var password : String = readln().toString()
    userList.add(User(userName,password))
    println("Congrats ! Account Created Successfully .")
    Function()
}
var userList : MutableList<User> = mutableListOf(
    User("rasel","1478"),
    User("shezan","1478"),
    User("prince","1478"),
    User("niloy","1478"),
    User("tanzid","1478")
)
fun Function(){
    println("1. Login\n2. SignUp\n3. Exit app")
    println("Enter 1 , 2 or 3")
    val loginOrSignUp : Int = readln().toInt()
    when(loginOrSignUp){
        1 -> loginPage()
        2 -> signUpPage()
        3 -> return
    }
}

fun main(){
    println("Welcome to Network Lab")
    Function()
    return
}
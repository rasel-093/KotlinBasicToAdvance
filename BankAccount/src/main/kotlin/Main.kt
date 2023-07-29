var accountBalance : Int = (0..1000).random()
fun main(args: Array<String>) {
    println("Welcome to your banking system")
    var accountType: String = " "


   while (accountType == " "){
       println("What type of account would you like to create ?")
       print("1. Debit  account\n2. Credit account\n3. Checking account \n")
       println("Choose an option (1,2 or 3")
       var userChoice : Int? = readln()?.toInt()
       when(userChoice){
           1 -> accountType = "debit"
           2 -> accountType = "credit"
           3 -> accountType = "saving"
           else -> continue
       }
   }
    println("Your selected option is $accountType account")
    println("The checking balance is ${accountBalance} dollars.")
    val money : Int = 0
    var exit : Boolean = false
    while (exit == false){
        println("What would you like to do?")
        println("1. Check bank account balance\n2. Withdraw money\n3. Deposit money\n4. Close the app")
        println("Select 1 , 2 , 3 or 4")
        var operation: Int = readln().toInt()
        when(operation){
            1 -> checkBalance()
            2 -> withdraxw(accountType)
            3 -> deposit(accountType)
            4 -> exit = true
        }
    }
}

fun checkBalance() {
    println("Your current balance is $accountBalance")
}

fun withdraxw(accountType : String)  {
    println("Enter amount : ")
    var amount : Int = readln().toInt()
    if(accountType == "debit"){
        if (amount == 0){
            println("Can't withdraw, no money on this account!")
            amount = 0
        }
        else{
            if(amount>accountBalance){
                amount =0
                println( "Not enough money on this account! The checking balance is ${accountBalance} dollars.")

            }
            else{
                accountBalance -= amount
            }
        }
    }
    else{
        accountBalance -= amount
    }
    println("You have withdrawn $ $amount, : Your current balance is $accountBalance $")
}

fun deposit(accountType: String){
    println("Enter amount : ")
    var amount : Int = readln().toInt()
   if (accountType == "credit"){
       if (accountBalance ==0){
            println("You don't need to deposit anything in order\n" +
                    "to pay off the account since it has already been paid off.\n" +
                    "Current balance = $accountBalance dollars")
       }
       else{
           if (accountBalance + amount > 0){
               println("Deposti failed. You tried to deposit an amount \n" +
                       "greater than the credit balance. The checking balance is $accountBalance dollars")
           }
           else{
               if(amount == - accountBalance){
                   accountBalance = 0
                   println("You have paid off this account! \n" +
                           "Current balance = $accountBalance dollars")
               }
               else{
                   accountBalance += amount
                   println("You have deposited $amount dollars.\n" +
                           "Current balance = $accountBalance dollars")
               }
           }
       }
   }
    else{
       accountBalance += amount
       println("You have deposited $amount dollars. \n" +
               "Current balance is $accountBalance dollars")
   }
}

fun createCheckingAccount() {
    TODO("Not yet implemented")
}

fun createCreditAccount() {
    TODO("Not yet implemented")
}

fun createDebitAccount() {
    TODO("Not yet implemented")
}

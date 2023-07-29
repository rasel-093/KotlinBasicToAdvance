class Player(
    val name: String,
    val surName: String,
){
    public
    var score: Score = Score()
    fun fullName():String{
        return name +" " + surName
    }
}
class Score(var lvlScore: Double = 0.0){
    var totalScore: Double = 0.0
    var bestScore:Double = 0.0
}
fun main(){
    val  player1 = Player (name = "Rasel", surName = "Rahman")
    val player2 = Player("Nicola","Tesla")
    var player1Score = Score(40.0)

    println(player1.fullName())
    println(player1.score.totalScore)
    println(player1.score.bestScore)
}
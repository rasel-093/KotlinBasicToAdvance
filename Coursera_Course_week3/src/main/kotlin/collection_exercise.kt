class Comment(
    val userId : Int,
    val message : String
)
//List of comments
var commentList : List<Comment> = listOf(Comment(5224    ,"What's going on?"),
    Comment(5241 ,"Nice Code"),
    Comment(6624    ,"Like it"),
    Comment(8818        ,"Hello everyone"))
//Set of blocked users
 var blockUserIds : Set<Int> = setOf(5224, 9001)

//Map of user relationship
var userIdToRelation : Map<Int,String> = mapOf(
    5241 to "Friend",
    6624 to "Work Collogue "
)
fun displayComment(){
    for (it in commentList){
        if (it.userId !in blockUserIds){
            var relation : String?
            if (userIdToRelation.contains(it.userId)){
                relation = userIdToRelation[it.userId]
            }
            else relation = "unknown"

            println("Comment : ${it.message} from $relation")
        }
    }
}
fun  main()
{
    displayComment()
}

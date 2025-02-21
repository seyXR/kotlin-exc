// // Step 1: Define the Comment class
// data class Comment(val userId: Int, val message: String)

// fun main() {
//     // Step 2: Store all the comments
//     val comments =
//             listOf(
//                     Comment(5241, "Nice code"),
//                     Comment(6624, "Like it"),
//                     Comment(5224, "What’s going on?"),
//                     Comment(9001, "Check out my website"),
//                     Comment(8818, "Hello everyone, :)")
//             )

//     // Step 3: Create a set of blocked user IDs
//     val blockedUsers = setOf(9001, 5224) // Users 9001 and 5224 are blocked

//     // Step 4: Create a map of user relationships
//     val userRelationships = mapOf(5241 to "Friend", 6624 to "Work Colleague")

//     // Step 5-7: Filter, find relationships, and display comments
//     for (comment in comments) {
//         if (comment.userId !in blockedUsers) {
//             val relation = userRelationships[comment.userId] ?: "Stranger"
//             println("Comment: \"${comment.message}\" from $relation")
//         }
//     }
// }

//// RESPUESTA:
// Step  1
class Comment(val userId: Int, val message: String)

fun main() {
    // Step  2
    val comments: List<Comment> =
            listOf(
                    Comment(5241, "Nice code"),
                    Comment(6624, "Like it"),
                    Comment(5224, "What’s going on?"),
                    Comment(9001, "Check out my website"),
                    Comment(8818, "Hello everyone :)")
            )

    // Step 3
    val blockedUserIds: Set<Int> = setOf(5224, 9001)

    // Step 4
    val userIdToRelation: Map<Int, String> = mapOf(5241 to "friend", 6624 to "close friend")

    // Step 5
    for (comment in comments) {

        // Step 6
        if (comment.userId !in blockedUserIds) {

            val relation = userIdToRelation[comment.userId] ?: "unknown"

            // Step 7
            println("Comment ${comment.message} from $relation")
        }
    }
}

enum class Difficulty {
    EASY, MEDIUM, HARD
}

class Quiz {
    val question1 = Question<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = Question<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 = Question<Int>("How many days are there between full moons?", 28, Difficulty.HARD)
	companion object StudentProgress {
    	var total: Int = 10
    	var answered: Int = 3
	}
}
fun Quiz.StudentProgress.printProgressBar() {
    repeat(Quiz.answered) { print("▓") }
    repeat(Quiz.total - Quiz.answered) { print("▒") }
    println()
    println(Quiz.progressText)
}
    
val Quiz.StudentProgress.progressText: String
get() = "${answered} of ${total} answered"

data class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)

fun main() {
    Quiz.printProgressBar()
   // println("${Quiz.answered} of ${Quiz.total} answered.")
}
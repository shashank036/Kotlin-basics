
fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8
    
    val result = sub(firstNumber, secondNumber)
    val anotherResult = sub(firstNumber, thirdNumber)
	
    println(result)
    println(anotherResult)
}

// Define add() function below this line

fun add(x:Int,y:Int): String {
    return("$x + $y = ${x + y}")
}

fun sub(x:Int,y:Int): String {
    return("$x - $y = ${x - y}")
}

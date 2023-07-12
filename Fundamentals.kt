
// Program Starts from Main Function
fun main(){
    // data in variable 
    val day = "Sunday"
    // If else if else
    if(day == "Monday"){
        println("Start your Job from Today!!")
    }else if(day == "Sunday"){
        println("It\'s fun day.. Enjoy!!")
    }else{
        println("Work Is Workshipp!!")
    }

    when(day){
        "Monday" -> println("Its monday")
        "Tuesday" -> println("Its Tuesday")
        "Wednesday" -> println("its Wednesday")
        "Thursday" -> println("Its Thursday")
        "Friday" -> println("Its Friday")
        "Saturday" -> println("Its Saturday")
        "Sunday"-> println("Its Sunday")
    }

    val num = 7
    when(num){
        in 1..5 -> println("Number exist...")
        in 5..10 -> println("dosent exist...")
        
        is Int -> println("is Number")
    }

    // if else as expression
    val trafficLightColor = "Green"
    val message = 
    if(trafficLightColor == "Red") "Stop"
    else if(trafficLightColor == "Color") "Slow"
    else if(trafficLightColor == "Green") "Go Go!!"
    else "Invalid Color"
    println(message)

    // when expression

    val whenMessage = 
    when(trafficLightColor){
        "Red" -> "Stop"
        "Orange" -> "Slow"
        "Green" -> "Go Go"
        else -> "Invalid Color"
    }
    println(whenMessage)

    // null variable

    var number: Int? = 10
    println(number)
    
    number = null
    println(number)

    // var name: String? = "Shashank"
    // println(name?.length)

    // name = null
    // println(name)
}
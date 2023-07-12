fun main() {
    println(birthdayGreeting("Shashank", 35))// parameters inside function
    println(birthdayGreeting(age = 2, name = "Rex"))//named arguments in parameter inside function
    println(birthdayGreeting())// run default function values as parameters
}

fun birthdayGreeting(name: String = "Rover", age: Int = 10): String { // default arguments in the function parameters
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now $age years old!"
    return "$nameGreeting\n$ageGreeting"
}

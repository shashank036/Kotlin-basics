enum class Daypart{
    MORNING, AFTERNOON, EVENING
}
data class Event(
    var title: String,
    var description:String? = null,
    var daypart:Daypart,
    var duration:Int
)
val Event.durationOfEvent: String
get() = if (this.duration < 60) {
    "short"
} else {
    "long"
}
fun main(){
   
    val events = mutableListOf<Event>(
        Event(
            title = "Rapper Ground",
            description = "At delhi",
            daypart = Daypart.MORNING,
            duration = 30
        ),
        Event(
            title = "Classical Event",
            daypart = Daypart.EVENING,
            duration = 45
        ),
        Event(
            title = "Rapper street underGround",
            description = "At delhi",
            daypart = Daypart.AFTERNOON,
            duration = 60
        )
    )
    val shortEvents = events.filter { it.duration < 60 }
    println("You have ${shortEvents.size} short events.")

    val groupedEvents = events.groupBy { it.daypart }
        groupedEvents.forEach { (daypart, events) ->
        println("$daypart: ${events.size} events")
    }   
    // println("Last event of the day: ${events[events.size - 1].title}")
    println("Last event of the day: ${events.last().title}")
    println("Duration of first event of the day: ${events[2].durationOfEvent}")

   
}


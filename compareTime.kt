fun main() {
    println(trackTime(300, 250))
    println(trackTime(300, 300))
    println(trackTime(200, 220))
    
}

fun trackTime(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {
    if(timeSpentToday > timeSpentYesterday) {
        return true
    }else {
        return false
    }
}
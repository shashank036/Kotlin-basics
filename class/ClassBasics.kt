class foo {
    val name = "Android TV"
    val category = "Entertainment"
    var deviceStatus = "online"
    var speakerVolume = 2
    set(value) {
        if (value in 0..100) {
            field = value
        }
    }
   fun turnOn(){
        println("Smart device is turned on.")
    }

    fun turnOff(){
        println("Smart device is turned off.")
    }
    
}

fun main(){
    val obj = foo()
    println(obj.name)
    println(obj.category)
    println(obj.deviceStatus)
    obj.speakerVolume=20
    println(obj.speakerVolume)
    obj.turnOn()
    obj.turnOff()


}
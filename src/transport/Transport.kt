package transport

open class Transport (
    val name: String,
    val speed: Int,
    val capacity: Int
) {
    open fun describe(){
        println("Transport: $name, speed: $speed, capacity: $capacity")
    }
    open fun move(){
        println("$name moving")
    }
    open fun specialAbility(){
        println("$name have a special ability")
    }
}
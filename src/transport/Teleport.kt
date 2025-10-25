package transport

class Teleport (
    name: String,
    speed: Int,
    capacity: Int
) : Transport(name, speed, capacity){
    override fun move() {
        println("$name instantly transport in different place")
    }

    override fun specialAbility() {
        println("$name requires mana for activation, instant transportation")
    }
}
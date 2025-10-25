package transport

class Dragon(
    name: String,
    speed: Int,
    capacity: Int
) : Transport(name, speed, capacity){
    override fun move() {
        println("$name fly high above the ground")
    }
    override fun specialAbility() {
        println("$name breathes fire and transports the hero through the air")
    }
}
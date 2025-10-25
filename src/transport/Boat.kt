package transport

class Boat (
    name: String,
    speed: Int,
    capacity: Int
) : Transport(name, speed, capacity){
    override fun move() {
        println("$name floats on water")
    }
    override fun specialAbility() {
        println("$name can transport a group along the rivers and lakes")
    }
}
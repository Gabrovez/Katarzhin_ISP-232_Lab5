package transport

class Horse (
    name: String = "Racehorse", // Я не был уверен, где это указывать, предполагаю что это имя
    speed: Int,
    capacity: Int
) : Transport(name, speed, capacity){
    override fun move() {
        println("$name gallops across the plains")
    }
    override fun specialAbility() {
        println("$name can speed up in combat")
    }
}
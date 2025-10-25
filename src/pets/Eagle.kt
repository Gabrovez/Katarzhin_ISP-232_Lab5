package pets

class Eagle(name: String): Pet(name = name, speed = 250, maxHP = 50) {
    val  flightHeight:  Int = 0
    override fun makeSound() {
        println("$name screams.")
    }

    override fun describe() {
        println("Pet $name have speed: $speed and his maxHP is: $maxHP")
        println("$name's keen gaze sees everything far away")
    }
}
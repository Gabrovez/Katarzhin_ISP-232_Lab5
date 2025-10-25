package pets

class Wolf(name: String): Pet(name = name, speed = 100, maxHP = 250) {
    val  packSize:  Int = 5
    override fun makeSound() {
        println("$name howls.")
    }

    override fun describe() {
        println("Pet $name have speed: $speed and his maxHP is: $maxHP")
        println("$name has a pack size of $packSize")
    }
}
package pets

class Bear(name: String): Pet(name = name, speed = 50, maxHP = 550) {
    val  strength:  Int = 350
    override fun makeSound() {
        println("$name growls.")
    }

    override fun describe() {
        println("Pet $name have speed: $speed and his maxHP is: $maxHP")
        println("$name has super strength - $strength")
    }
}
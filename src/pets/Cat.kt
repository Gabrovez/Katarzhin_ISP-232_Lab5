package pets

class Cat(name: String): Pet(name = name, speed = 80, maxHP = 150) {
    val  stealthLevel:  Int = 90
    override fun makeSound(){
        println("$name meows.")
    }

    override fun describe() {
        println("Pet $name have speed: $speed and his maxHP is: $maxHP")
        println("Our $name is very stealthy($stealthLevel stealth!) and quiet!.")
    }
}
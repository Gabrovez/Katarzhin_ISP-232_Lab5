package pets

open class Pet (
    val name: String,
    val maxHP : Int,
    val speed : Int
){
    open fun describe(){
        println("Pet $name have speed: $speed and his maxHP is: $maxHP")
    }
    open fun makeSound(){
        println("$name make a sound")
    }
}
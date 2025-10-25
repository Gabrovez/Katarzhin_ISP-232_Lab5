package pets

fun main(){
    val pets = listOf(Wolf("Fenrir",), Cat("Smokey"), Eagle("Skywind"), Bear("Balu"))
    for (pet in pets){
        pet.describe()
        pet.makeSound()
        println()
    }
}
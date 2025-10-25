package pets

fun main(){
    val pets = listOf<Pet>(
        Wolf("Fenrir"),
        Cat("Smokey"),
        Eagle("Skywind"),
        Bear("Balu"),
    )
    for (pet in pets){
        pet.describe()
        pet.makeSound()
        println()
    }
}
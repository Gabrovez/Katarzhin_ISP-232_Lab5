package characters

class NPC(
    name: String,
    hp: Int = 100,
    element: String = "Neutral",
    val faction: String = "Town dwellers",
    val hasQuest: Boolean = false
): GameCharacter(name, hp, element){
    fun giveQuest(): String{
        return if (hasQuest) {
            "$name offers you a quest"
        }else{
            "$name has no quest for you"
        }
    }
    fun trade(){
        println("$name opened a trade")
    }
}

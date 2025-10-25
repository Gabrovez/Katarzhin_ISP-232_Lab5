package world

fun main(){
    /*val missions = listOf<Mission>(
        Quest("Monster hunting", 3,600,"Medium"),
        SpecialOperation("Night raid", 1500, reqClearance = 2, isCovert = true),
        Contract("Caravan escort", "Trade guild", "Deliver cargo through the forest", 800, isUrgent = true)
    )
    for (miss in missions){
        miss.describe()
        println("High reward? ${if (miss.isHighReward()) "Yes" else "No"}")
        println()
    }*/
    val escortQuest = Quest(
        title =  "Escort trader to the village",
        duration = 4,
        reward = 120,
        difficulty = "Medium",
        questType = QuestType.ESCORT
    )
    escortQuest.printInfo()



}
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
    }
    val quests = listOf<Quest>(
        Quest(title = "Escort trader to the village", duration = 4, reward = 120, difficulty = "Medium",questType = QuestType.ESCORT),
        Quest(title = "Eliminate group of hostile orcs",duration = 2, reward = 250, difficulty = "Medium",questType = QuestType.ELIMINATION),
        Quest("Explore the forgotten lands",  20, 500, "Medium", QuestType.EXPLORE),
        Quest("Delivery pizza to the trade guild", 1, 100, "Easy", QuestType.DELIVERY),
        Quest("Defeat the ancient evil", 12, 2500, "Hard", QuestType.BOSSFIGHT),
        Quest("Explore the forbidden realms",  100, 2000, "Hard", QuestType.EXPLORE),
    )
    for (ques in quests){
        ques.describe()
        ques.printInfo()
        println()
    }
    println("Only Explore")
    fun onlyExplore(){
        for (ques in quests){
            if(ques.questType == QuestType.EXPLORE){
                ques.describe()
                ques.printInfo()
                println()
            }
        }
    }
    onlyExplore()*/
    val trader = TraderDz()
    trader.start()







}
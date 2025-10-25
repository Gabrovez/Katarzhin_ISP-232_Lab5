package world

fun main(){
    /*val quests = mutableListOf<world.Quest>()
    for (i in 1..3){
        println("Добавим квест #$i")
        val q = world.Quest("Охота на гоблинов", 2,3400, "лёгкий")
        quests.add(q)
        println()
    }
    println("Все доступные квесты: ")
    for (q in quests){
        q.printInfo()
    }
    val contract = world.Contract("Торговец", "Сопровождение каравана", 1500 )
    contract.printContractInfo()
    val quest = world.Quest("Побег из замка",  5, 700, "Сложный")
    println("Квест сложный? ${quest.isHard()}")

    val quest1 = Quest(title = "Охота", duration = 2, reward = 300, difficulty = "Средний")
    println(quest1.goldPerHour()) // 150
    val quest2 = Quest(title = "Рыбалка", duration = 0, reward = 500, difficulty = "Лёгкий")
    println(quest2.goldPerHour()) //0

    val quest = Quest("Search of an artifact", 3,800, "Medium")
    val contract = Contract("Caravan protection", "Trade guild", "Cargo security", 1200)
    val specialOP = SpecialOperation("Operation 'Shadow'",2500, 2, true)
    println("Quest info:")
    println("Title: ${quest.title}, Reward : ${quest.reward}")
    println("\nContract info:")
    println("Title: ${contract.title}, Client : ${contract.clientName}")
    println("\nSpecial operation info:")
    println("Title: ${specialOP.title}")
    specialOP.showReward()*/
    val missions = listOf<Mission>(
        Quest("Monster hunting", 3,600,"Medium"),
        SpecialOperation("Night raid", 1500, reqClearance = 2, isCovert = true),
        Contract("Caravan escort", "Trade guild", "Deliver cargo through the forest", 800, isUrgent = true)
    )
    for (miss in missions){
        miss.describe()
        println("High reward? ${if (miss.isHighReward()) "Yes" else "No"}")
        println()
    }


}
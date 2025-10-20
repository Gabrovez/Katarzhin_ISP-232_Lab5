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
    */
    val quest1 = Quest(title = "Охота", duration = 2, reward = 300, difficulty = "Средний")
    println(quest1.goldPerHour()) // 150
    val quest2 = Quest(title = "Рыбалка", duration = 0, reward = 500, difficulty = "Лёгкий")
    println(quest2.goldPerHour()) //0
}
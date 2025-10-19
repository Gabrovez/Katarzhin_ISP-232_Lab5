fun main(){
    val quests = mutableListOf<Quest>()
    for (i in 1..3){
        println("Добавим квест #$i")
        val q = Quest("Охота на гоблинов", 2,3400, "лёгкий")
        quests.add(q)
        println()
    }
    println("Все доступные квесты: ")
    for (q in quests){
        q.printInfo()
    }
}
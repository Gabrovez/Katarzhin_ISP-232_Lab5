fun main(){
    val quests = mutableListOf<Quest>()
    for (i in 1..3){
        println("Добавим квест #$i")
        val q = Quest()
        print("Название: ")
        val title = readln()
        print("Время (ч): ")
        val duration = readln().toInt()
        print("Награда: ")
        val reward = readln().toInt()
        print("Сложность: ")
        val difficulty = readln()
        q.init(title, duration, reward, difficulty)
        quests.add(q)
        println()
    }
    println("Все доступные квесты: ")
    for (q in quests){
        q.printInfo()
    }
}
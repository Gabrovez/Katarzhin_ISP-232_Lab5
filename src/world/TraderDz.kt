package world

import kotlin.collections.forEachIndexed

class TraderDz(
    private val quests: MutableList<Quest> = mutableListOf()
) {
    fun addQuest(quest: Quest){
        quests.add(quest)
        println("Quest '${quest.title}' added.")
    }
    fun makeQuest(){
        //Я не уловил мысль, в чём прикол функции addQuest, типо если конструктор самого квеста в неё не засунешь ибо она принимает уже готовой квест.
        //Так что я сделаю отдельную функцию для создания квеста.
        print("Enter title of the Quest: ")
        val til = readln()
        print("Enter duration of the Quest(in hours): ")
        val dur = readln().toInt()
        print("Enter reward of the Quest(in gold coins): ")
        val rew = readln().toInt()
        print("Enter difficulty of the Quest: ")
        val diff = readln()
        print("Enter type of the Quest(1 - DELIVERY, 2 - ELIMINATION, 3 - ESCORT, 4 - EXPLORE, 5 - BOSSFIGHT): ")
        val inp = readln().toInt()
        val nQuest: Quest? = when(inp){
            1 ->  Quest(til, dur,rew,diff, questType = QuestType.DELIVERY )
            2 -> Quest(til, dur,rew,diff, questType = QuestType.ELIMINATION )
            3 ->  Quest(til, dur,rew,diff, questType = QuestType.ESCORT )
            4 -> Quest(til, dur,rew,diff, questType = QuestType.EXPLORE )
            5 -> Quest(til, dur,rew,diff, questType = QuestType.BOSSFIGHT )
            else ->{
                println(println("Incorrect input. Choose one of those mentioned above."))
                null // kotlin.Unit выводится из-за этого как я понимаю типо тут null. И поэтому он его пишет. Я его оставлю ибо ошибку он всё равно пишет нормально так что.... да
            }
        }
        if (nQuest != null) addQuest(nQuest)
    }
    fun showAvailableQuests(){
        if (quests.isEmpty()){
            println("Quest list is empty.")
        }else{
            quests.forEachIndexed { index, quest ->
                print("${index + 1}. ")
                quest.describe()
            }
        }
    }
    fun giveQuest(index: Int): Quest?{
        return if (index in 1..quests.size){
            quests[index - 1]
        }else{
            null
        }
    }
    fun removeQuest(index: Int){
        if (index in 1..quests.size){
            val remQuest = quests.removeAt(index - 1)
            println("Quest '${remQuest.title}' was deleted from Quest list.")
        }else{
            println("Incorrect number of a Quest.")
        }
    }
    fun start(){
        while (true) {
            println()
            println("Select an action: ")
            println("1 - Add quest")
            println("2 - Show all quest")
            println("3 - Take quest( remove from the list)")
            println("0 - Exit")
            print("Your choice: ")
            when(readln()){
                "1" -> makeQuest()
                "2" -> showAvailableQuests()
                "3" -> {
                    if (quests.isEmpty()){
                        println("Quest list is empty. You can't delete something that doesn't even there")
                    }else{
                        showAvailableQuests()
                        print("Enter number of Quest you want to take: ")
                        val numb = readln().toInt()
                        val ques = giveQuest(numb)
                        if (ques != null){
                            removeQuest(numb)
                            println("You take quest: '${ques.title}'. Good luck with it!")
                        }else{
                            println("Incorrect input.")
                        }
                    }
                }
                "0" -> {
                    println("Exit from the app.")
                    break
                }
                else -> println("Incorrect input. Try again.")

            }
        }



    }
}
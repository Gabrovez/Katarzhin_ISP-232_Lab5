package characters
import world.Quest

class Trader(
    val name: String,
    private val quests: MutableList<Quest> = mutableListOf()
) {
    fun showAvailableQuests(){
        println("Available quests from $name:")
        quests.forEachIndexed { index, quest ->
            println("${index + 1}. ${quest.title} (${quest.questType.description}) - Reward: ${quest.reward} gold coins")

        }
    }
    fun giveQuest(index: Int) : Quest {
        return quests[index - 1]
    }
    fun addQuest(quest: Quest){
        quests.add(quest)
        println("Quest '${quest.title}' added to list of $name.")
    }
}
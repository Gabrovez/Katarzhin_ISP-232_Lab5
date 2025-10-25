package characters

import world.Quest
import world.QuestType


fun main() {
    /*// Тестируем NPC
    val blacksmith = NPC( "Blacksmith Ulfric", hasQuest = true)
    println(blacksmith.giveQuest())
    blacksmith.trade()
    // Тестируем Boss
    val dragon = Boss ("Alduin", 500,  "Fire",  4, true)
    dragon.startPhase (phasenum = 2)
    println(dragon.dropLoot())
    dragon.takeDamage (amount = 150)
    val enemy: GameCharacter = Enemy ( "Jhin")
    val hero = Hero ("Naruto")
    val npc = NPC("Merchant")
    (enemy as Enemy).takeDamage(20)
    enemy.takeDamage(20)
    println(enemy.name)*/

    val trader = Trader("Ralf")

    trader.addQuest(Quest("Collect the herbs", 2, 50, "Easy", QuestType.DELIVERY))
    trader.addQuest(Quest("Kill the wolves", 3, 100, "Medium", QuestType.ELIMINATION))
    trader.showAvailableQuests()
    val selectedQuest = trader.giveQuest(1)
    selectedQuest.describe()

}
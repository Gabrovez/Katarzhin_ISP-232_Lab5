package characters

import magic.Spell
import world.Quest

fun main() {
    /*val naruto = Hero("Наруто", "Мужской", "Шиноби", 5, "Ветер", 150, 200)
    val kakashi = Hero("Какаши", "Мужской", "Шиноби", 15, "Молния", 250, 300)
    val orochimaru = Enemy("Орочимару", 350, "Ветер")
    naruto.castSpellOn(orochimaru,"Рассенган", 30)
    naruto.duel(kakashi)

    val hero1 = Hero(name = "Артур", hp = 100)
    println("Герой жив? ${hero1.isAlive()}")
    val hero2 = Hero(name = "Артур", hp = 0)
    println("Герой жив? ${hero2.isAlive()}")

    val hero = Hero(name = "Артур", level = 4) // Уровень 4
    val easyQuest = Quest( "Сбор трав",  2,  100, "Лёгкий")
    val hardQuest = Quest("Охота на дракона",  10,  1000,  "Сложный")

    hero.canAcceptQuest (easyQuest)
    hero.canAcceptQuest (hardQuest)

    val enemy1 = Enemy(name = "Гоблин", hp = 30)
    println(enemy1.getThreatLevel())
    val enemy2 = Enemy(name = "Орк", hp = 100)
    println(enemy2.getThreatLevel())
    val enemy3 = Enemy(name = "Дракон", hp = 200)
    println(enemy3.getThreatLevel())
    println("Мощь ${enemy3.name}а равна ${enemy3.calculatePower()}")
    val z = Enemy(name = "Zombie", hp = -200)
    println(z.getThreatLevel())

    val voin = Hero("Артур", level = 2)
    val wizard = Hero("Гендальф", level = 12)
    val firewall = Spell("Молния", 4,1, "\u26A1")
    firewall.cast()
    println("Воин может это кастануть: ${voin.canCast(firewall)}")
    println("Волшебник может это кастануть: ${wizard.canCast(firewall)}")
    val fireball = Spell("Громовой шаг", 2, "\u2728")
    fireball.cast()
    println("$ Воин может это кастануть: ${voin.canCast(fireball)}")
    println("$ Волшебник может это кастануть: ${wizard.canCast(fireball)}")*/
    // Тестируем NPC
    val blacksmith = NPC( "Blacksmith Ulfric", hasQuest = true)
    println(blacksmith.giveQuest())
    blacksmith.trade()
// Тестируем Boss
    val dragon = Boss ("Alduin", 500,  "Fire",  4, true)
    dragon.startPhase (phasenum = 2)
    println(dragon.dropLoot())
    dragon.takeDamage (amount = 150)

}
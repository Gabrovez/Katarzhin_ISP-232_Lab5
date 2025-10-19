fun main() {
    val naruto = Hero("Наруто", "Мужской", "Шиноби", 5, "Ветер", 150, 200 )
    val kakashi = Hero("Какаши", "Мужской","Шиноби", 15, "Молния", 250, 300 )
    val orochimaru = Enemy("Орочимару", 350, "Ветер")
    naruto.castSpellOn(orochimaru,"Рассенган", 30)
    naruto.duel(kakashi)
}
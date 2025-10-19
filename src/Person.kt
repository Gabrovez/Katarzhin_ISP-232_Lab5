fun main() {
    val naruto = Hero()
    naruto.name = "Наруто"
    naruto.role = "Шиноби"
    naruto.element = "Ветер"
    naruto.mp = 100
    val kakashi = Hero()
    kakashi.name = "Какаши"
    kakashi.role = "Шиноби"
    kakashi.element = "Молния"
    kakashi.mp = 100
    val orochimaru = Enemy()
    orochimaru.name = "Орочимару"
    orochimaru.element = "Ветер"

    naruto.castSpellOn(orochimaru,"Рассенган", 30)
    naruto.duel(kakashi)
}
package characters

open class Enemy(
    name: String,
    hp: Int = 0,
    element: String = "No Info"
) : GameCharacter(name, hp, element){
    fun getThreatLevel(): String{
        if (hp <0){
            return "Некорректное здоровье"
        }
        return when{
            hp <= 50 -> "Низкий"
            hp <= 150 -> "Средний"
            else -> "Высокий"
        }
    }
    fun calculatePower(aggressionLevel: Int = 2): Int{
        val power =  hp * aggressionLevel
        return power
    }
    fun isStrong(): Boolean{
        return hp > 100
    }
    fun takeDamage(amount: Int) {
        println("$name получает $amount урон!")
        hp -= amount
        if(hp < 0) hp = 0
        println("Осталось здоровья: $hp")
    }

}
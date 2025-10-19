class Enemy {
    val name: String
    var hp: Int
    val element: String
    fun takeDamage(amount: Int) {
        println("$name получает $amount урон!")
        hp -= amount
        if(hp < 0) hp = 0
        println("Осталось здоровья: $hp")
    }
    constructor(name: String, hp: Int, element: String){
        this.name = name
        this.hp = hp
        this.element = element
    }

}
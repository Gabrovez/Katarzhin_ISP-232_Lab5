package characters
import magic.Spell
import world.Quest

class Hero(
    val name: String,
    val gender: String ="",
    val role: String = "",
    val level: Int = 0,
    val element: String = "",
    var hp: Int = 1,
    var mp: Int = 1
) {
    fun canCast(spell: Spell): Boolean{
        return (spell.name.length <= level * 2) && (spell.width <= 5 && spell.height <= 5)
    }
    fun canAcceptQuest(quest: Quest): Boolean{
         val canAccept = when(quest.difficulty.lowercase()){
            "лёгкий" -> level >= 1
            "средний" -> level >= 3
            "сложный" -> level >= 5
            else -> false
        }
        if (canAccept){
            println("$name может принять квест «${quest.title}>>!")
        }else{
            println("$name не может принять квест «${quest.title}>>.Требуется более высокий уровень.")
        }
        return canAccept
    }
    fun isAlive(): Boolean{
        return hp > 0
    }
    fun sayHello(){
        println("Я - $name, мой путь только начинается!")
    }
    fun showStats(){
        println("Имя: $name | Класс: $role | Здоровье: $hp | Мана: $mp | Уровень: $level | Стихия: $element")
    }
    fun meditate() {
        println("$name медитирует...")
        mp += 20
        println("Мана восстановлена! Текущая мана: $mp")
    }
    fun takeDamage(amount: Int) {
        println("$name получает $amount урон!")
        hp -= amount
        if(hp < 0) {
            hp = 0
            die()
        }else{
            println("Осталось здоровья: $hp")
        }

    }
    fun castSpell(){
        if (mp != 0 ){
            mp -= 10
            println("$name Кастует фаерболл, потрачено 10 маны")
        }else{
            println("Недостаточно маны! У вас только 0.")
        }
    }
    fun heal(){
        if (mp != 0 ){
            hp += 10
            mp -= 10
            println("Лечусь! Восстановлено здоровье, потрачено 10 маны.")
            println("Здоровье: $hp | Мана: $mp")
        }else{
            println("Недостаточно маны! У вас только 0.")
        }
    }
    fun greet(name: String){
        println("Привет, $name!")
    }
    fun die(){
        println("$name умер")
    }
    fun attack(enemy: Enemy, damage: Int){
        println("$name атакует врага ${enemy.name}!")
        enemy.takeDamage(damage)
    }
    fun castSpellOn(enemy: Enemy, spellName: String, damage: Int){
        println("$name использует заклинание '$spellName' против ${enemy.name}!")
        if (element == enemy.element){
            println("Стихии совпадают! Урон снижен.")
            val reducedDamage = damage / 2
            enemy.takeDamage(reducedDamage)
        }else{
            enemy.takeDamage(damage)
        }
        mp -= 10
        if(mp < 0) mp = 0
        println("Осталось маны: $mp")
    }
    fun duel(opponent: Hero){
        println("Дуэль между $name и ${opponent.name} начинается!")

        println("$name атакует первым!")
        opponent.takeDamage (amount = 15)

        println("${opponent.name} отвечает!")
        this.takeDamage (amount = 15)

        println("Дуэль завершена.")
        println("Состояние героев:")
        this.showStats()
        opponent.showStats()
    }




}
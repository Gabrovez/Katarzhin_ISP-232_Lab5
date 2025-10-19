class Hero {
    var name: String = "Неизвестный"
    var gender: String = "Не указан"
    var role: String = "Бродяга"
    var hp: Int = 100
    var mp: Int = 50
    var level: Int = 1
    var element: String = "Без стихии"
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
    fun castSpellOn(enemy: Enemy,spellName: String ,damage: Int){
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
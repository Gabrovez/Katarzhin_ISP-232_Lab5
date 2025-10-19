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
    fun takeDamage() {
        println("$name получает урон!")
        hp -= 10
        println("Осталось здоровья: $hp")
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



}
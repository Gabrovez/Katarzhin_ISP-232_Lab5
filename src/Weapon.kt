class Weapon {
    var name: String = "Оружие"
    var damage: Int = 10
    var durability: Int = 100
    var type: String = "Обычное"
    fun  showInfo(){
        println("Название оружия: ${this.name} Урон: ${this.damage} Прочность: ${this.durability} Тип оружия: ${this.type}")
    }
    fun use(){
        if(durability <= 0){
            println("Оружие сломано!")
        }else{
            println("Вы использовали оружие, прочность стала меньше на 10. Осталось : $durability")
            durability -= 10
        }
    }
    fun upgrade (bonus: Int){
        damage += bonus
        println("Вы улучшили оружие, урон стала больше на $bonus. Урон : $damage")
    }
}
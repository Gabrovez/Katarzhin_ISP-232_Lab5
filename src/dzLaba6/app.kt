package dzLaba6
fun main(){
    val sword = Item("Меч Балдурана", "Оружие", 1500)
    val armor = Item("Доспех рыцаря", "Оружие", 250)
    val potion = Item("Зелье здоровья", "зелье")
    val ring = Item("Вечная удача", "кольцо")
    sword.printInfo()
    armor.printInfo()
    potion.printInfo()
    ring.printInfo()

}

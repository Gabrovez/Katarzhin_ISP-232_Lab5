package artifact

class Weapon(
    name: String,
    power:Int,
    rarity: String,
    val damageType: String,
    val isTwoHanded: Boolean = false
) : MagicItem(name, power, rarity){
    override fun describe() {
        println("Title: $name, power: $power, rarity: $rarity, damage type: $damageType")
    }

    override fun use() {
        println("Deal $damageType damage with power: $power")
    }
}
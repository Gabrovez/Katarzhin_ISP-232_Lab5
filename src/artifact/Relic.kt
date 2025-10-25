package artifact

class Relic (
    name: String,
    power:Int,
    rarity: String,
    val origin: String,
    var charges: Int
) : MagicItem(name, power, rarity){
    override fun describe() {
        println("Title: $name, power: $power, rarity: $rarity, origin : $origin")
    }
    override fun use() {
        charges -= 1
        println("You spend 1 charge of $name. You have $charges more left.")
    }
}
package artifact

class Potion (
    name: String,
    power:Int,
    rarity: String,
    val effectDuration: Int,
    val isConsumable: Boolean = true
) : MagicItem(name, power, rarity){
    override fun describe() {
        println("Title: $name, power: $power, rarity: $rarity, effect duration: $effectDuration")
    }
    override fun use() {
        return if (isConsumable) {
            println("You spend your only chance to use $name. It will last: $effectDuration seconds, but was it truly worth it?")
        }else{
           println("You use one of many charges of $name")
        }
    }
}
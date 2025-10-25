package artifact

open class MagicItem(
    val name: String,
    val power:Int,
    val rarity: String
) {
    open fun describe(){
        println("Title: $name, power: $power, rarity: $rarity")
    }
    open fun use(){
        println("$name was used")
    }
}
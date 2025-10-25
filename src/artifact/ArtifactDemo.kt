package artifact

fun main(){
    val artifacts = listOf<MagicItem>( // List<MagicItem> я не совсем понял точно ли так должно быть написано или это образно, так что я сделал как мы делали раньше
        Weapon("Blackrazor", 100, "Legendary", "Darkness", isTwoHanded = true),
        Potion("Potion of Dragon’s Majesty", 1000, "Legendary", 3600),
        Relic("Orb of purgatory", 10000, "Mythical", "Demonic", 5)
    )
    for (artif in artifacts){
        artif.describe()
        artif.use()
        println()
    }

}

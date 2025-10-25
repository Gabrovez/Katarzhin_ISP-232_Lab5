package magic

fun main(){
    val fireball = Spell( "Fireball", 3,  3, "\uD83D\uDD25")
    val heal = InstantSpell( "Heal",  "\uD83D\uDC9A",  5)

    println("Spell: ${fireball.name}")
    println("Symbol: ${fireball.symbol}")
    println("Duration: ${fireball.duration} seconds")

    println("\nInstant spell: ${heal.name}")
    println("Symbol: ${heal.symbol}")
    println("Power: ${heal.power}")
    println("Duration: ${heal.duration} seconds")
}
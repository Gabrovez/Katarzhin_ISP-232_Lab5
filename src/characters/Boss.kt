package characters

class Boss (
    name: String,
    hp: Int,
    element: String,
    val phaseCount: Int  = 3,
    val isFinalBoss: Boolean = false
) : Enemy(name, hp, element){
    fun dropLoot(): String {
        return if (isFinalBoss) {
            "Legendary items"
        }else{
            "Epic items"
        }
    }
    fun startPhase(phasenum: Int){
        require(phasenum in 1..phaseCount){"Wrong number of phase"}
        println("$name activates his $phasenum phase!")
    }

}
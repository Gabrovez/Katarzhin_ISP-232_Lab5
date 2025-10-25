package world

class SpecialOperation (
    title: String,
    reward: Int,
    var reqClearance: Int,
    val isCovert: Boolean
) : Mission(title, reward){
    fun showReward(){
        println("Required clearance: $reqClearance")
        println("Secrecy mode: ${if (isCovert) "Top secret" else "Common"}")
    }
}
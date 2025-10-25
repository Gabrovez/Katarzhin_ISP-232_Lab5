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

    override fun describe() {
        println("Spec Op '$title'. Required Clearance: $reqClearance, mode: ${if(isCovert) "Secret" else "Openly"}, reward: $reward gold coins")
    }
}
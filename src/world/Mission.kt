package world

open class Mission (
    var title: String,
    var reward: Int
) {
    open fun describe(){
        println("Mission: $title, Reward: $reward gold coins")
    }
    open fun isHighReward(): Boolean{
        return reward > 1000
    }

}
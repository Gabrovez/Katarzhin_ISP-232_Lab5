package world

class Quest(
    title: String,
    val duration: Int ,
    reward: Int,
    val difficulty: String,
    val questType: QuestType

) : Mission(title, reward) {
    fun  printInfo(){
        println("Title of quest: ${this.title} ")
        println("Type of quest: ${questType.description}")
        println("Execution time: ${this.duration} h. ")
        println("Reward: ${this.reward} gold coins ")
        println("Difficulty level: ${this.difficulty}")

    }
    fun isHard(): Boolean{
        return difficulty.lowercase() == "Сложный"
    }
    fun goldPerHour(): Int{
        require(duration >=0 && reward >=0){"Длительность и награда не могут быть отрицательными!"}
        if (duration == 0) return 0
        return reward/duration
    }
    override fun describe() {
        println("Quest '$title' for $duration hours, difficulty: $difficulty, reward: $reward gold coins")
        println("Type of quest: ${questType.description}")
    }

}
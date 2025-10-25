package world

class Quest(
    title: String,
    val duration: Int = 0,
    reward: Int,
    val difficulty: String = ""
) : Mission(title, reward) {
    fun  printInfo(){
        println("Название квеста: ${this.title} Время выполнения: ${this.duration} Награда: ${this.reward} золотых Уровень сложности: ${this.difficulty}")
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
    }
}
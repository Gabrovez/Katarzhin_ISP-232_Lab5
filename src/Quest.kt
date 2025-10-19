class Quest {
    val title: String
    val duration: Int
    val reward: Int
    val difficulty: String
    fun  printInfo(){
        println("Название квеста: ${this.title} Время выполнения: ${this.duration} Награда: ${this.reward} золотых Уровень сложности: ${this.difficulty}")
    }
    constructor(title: String, duration: Int, reward: Int, difficulty: String){
        this.title = title
        this.duration = duration
        this.reward = reward
        this.difficulty = difficulty

    }
}
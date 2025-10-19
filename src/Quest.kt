class Quest(
    val title: String = "",
    val duration: Int = 0,
    val reward: Int = 0,
    val difficulty: String = ""
) {
    fun  printInfo(){
        println("Название квеста: ${this.title} Время выполнения: ${this.duration} Награда: ${this.reward} золотых Уровень сложности: ${this.difficulty}")
    }
}
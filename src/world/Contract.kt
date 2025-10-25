package world

class Contract (
    title: String,
    val clientName: String,
    val taskDescription: String,
    reward: Int,
    val isUrgent: Boolean = false
) : Mission(title, reward){
    fun printContractInfo() {
        println("Заказчик: $clientName")
        println("Задача: $taskDescription")
        println("Награда: $reward")
        println("Срочность: ${if (isUrgent) "Срочно!" else "Обычный контракт"}")
    }
    override fun describe() {
        println("Contract '$title' from $clientName: $taskDescription (${if(isUrgent) "Urgently" else "Commonly"}), reward: $reward gold coins")
    }
}
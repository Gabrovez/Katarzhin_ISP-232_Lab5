package dzLaba6

class Location (
    val name: String = "Собрать цветочки",
    val dangerLevel: String = "Низкий" ,
    val requiredLevel: Int = 1
){
    fun isDangerous(): Boolean{
        return dangerLevel.lowercase() == "высокий"
    }
    fun printInfo() {
        println("Название: $name, Уровень опасности: $dangerLevel, Требуемый уровень: $requiredLevel")
    }
}
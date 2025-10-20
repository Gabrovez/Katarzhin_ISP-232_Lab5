package dzLaba6

class Item (
    val name: String= "",
    val type: String,
    val value: Int
) {
    constructor(name: String, type: String) : this(name, type, 0)
    fun printInfo() {
        println("Предмет: $name, Тип: $type, Стоимость: $value")
    }
}
package dzLaba6
fun main(){
    val  forest = Location("Тёмный лес", "Высокий", 5)
    val town = Location("Тихий городок")
    forest.printInfo()
    println("${forest.name} опасна: ${forest.isDangerous()}")
    town.printInfo()
    println("${town.name} опасна: ${town.isDangerous()}")

}

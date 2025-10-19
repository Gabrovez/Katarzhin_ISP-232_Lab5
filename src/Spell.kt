class Spell {
    val name: String
    val width: Int
    val height: Int
    val symbol: String
    constructor(name: String, width: Int, height: Int, symbol: String){
        this.name = name
        this.width = width
        this.height = height
        this.symbol = symbol
    }
    constructor(name: String, size: Int, symbol: String){
        this.name = name
        this.width = size
        this.height = size
        this.symbol = symbol
    }
    constructor(){
        this.name = ""
        this.width = 0
        this.height = 0
        this.symbol = ""
    }

    fun cast(){
        println("Кастуем $name!")
        repeat(height){
            repeat(width){
                print(symbol)
            }
            println()
        }
    }

}
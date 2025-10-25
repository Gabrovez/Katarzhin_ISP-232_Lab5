package magic

class Spell(
    name: String,
    val width: Int = 0,
    val height: Int = 0,
    symbol: String
) : MagicEffect(name, symbol, 10) {
    constructor(name: String, size: Int, symbol: String) : this(name, size, size, symbol)
    fun cast(){
        println("Кастуем $name!")
        repeat(height){
            repeat(width){
                print(symbol)
            }
            println()
        }
    }
    fun description(): String{
        return "Заклинание $name занимает область ${width}x$height и использует символ $symbol"
    }
    fun area():Int {
        return width * height
    }

}
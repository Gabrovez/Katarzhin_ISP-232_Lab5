package dzLaba5

fun main(){
    val calc = GeometryCalculator()
    println("=== Прямоугольники ===")
    calc.rectangleInfo(4,5)
    calc.rectangleInfo(3,6)
    println("=== Треугольники ===")
    calc.triangleInfo(3,4,5)
    calc.triangleInfo(5,5,5)
    calc.triangleInfo(2,3,4)
    println("=== Окружности ===")
    calc.circleInfo(5)
    calc.circleInfo(10)
}
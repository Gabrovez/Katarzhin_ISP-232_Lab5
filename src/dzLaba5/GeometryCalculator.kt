package dzLaba5

class GeometryCalculator {
    fun rectangleInfo(width: Int, height: Int){
        println("Прямоугольник $width x $height:")
        val per = 2 * (width + height)
        println("Периметр: $per")
        val area = width * height
        println("Периметр: $area")
        if (per == area){
            println("Удивительно! Периметр равен площади!")
        }
        println()
    }
    fun triangleInfo(s1: Int, s2: Int, s3: Int){
        println("Треугольник со сторонами: $s1, $s2, $s3")
        val pryam  = (s3 * s3 == (s1 * s1) + (s2 * s2))
        if (pryam){
            println("Это прямоугольный треугольник!")
        }else{
            println("Это не прямоугольный треугольник")
        }
        val peri  = s1 + s2 + s3
        println("Периметр: $peri")
        println()
    }
    fun circleInfo(rad: Int){
        println("Окружность с радиусом $rad")
        val dlin = 2 * Math.PI * rad
        println("Длина окружности: $dlin")
        val ar = Math.PI * rad * rad
        println("Площадь круга: $ar")
        println()
    }
}
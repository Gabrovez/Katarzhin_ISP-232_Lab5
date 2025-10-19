fun main() {
    val naruto: Hero = Hero()
    naruto.name = "Наруто Узумаки"
    naruto.gender = "Мужской"
    naruto.role = "Хокаге"
    naruto.hp = 200
    naruto.mp = 150
    println("Имя: ${naruto.name} \nПол: ${naruto.gender} \nКласс: ${naruto.role}\nЗдоровье: ${naruto.hp}\nМана: ${naruto.mp}")
    val sasuke = Hero()
    sasuke.name = "Саске Учиха"
    sasuke.gender = "Мужской"
    sasuke.role = "Шиноби-отступник"
    sasuke.hp = 120
    sasuke.mp = 180
    println("Имя: ${sasuke.name} \nПол: ${sasuke.gender} \nКласс: ${sasuke.role}\nЗдоровье: ${sasuke.hp}\nМана: ${sasuke.mp}")
    val gojo = Hero()
    gojo.name = "Годжо Сатору"
    gojo.gender = "Мужской"
    gojo.role = "Маг проклятий"
    gojo.hp = 160
    gojo.mp = 300
    println("Имя: ${gojo.name} \nПол: ${gojo.gender} \nКласс: ${gojo.role}\nЗдоровье: ${gojo.hp}\nМана: ${gojo.mp}")

    val hero = Hero()
    println("Введите имя героя")
    hero.name = readln()
    println("Введите пол героя")
    hero.gender = readln()
    println("Введите класс героя")
    hero.role = readln()
    println("Введите здоровье героя")
    hero.hp = readln().toInt()
    println("Введите ману героя")
    hero.mp = readln().toInt()
    println("Введите уровень героя")
    hero.level = readln().toInt()
    println("Введите стихию героя")
    hero.element = readln()
    println("Имя: ${hero.name} \nПол: ${hero.gender} \nКласс: ${hero.role}\nЗдоровье: ${hero.hp}\nМана: ${hero.mp}\nУровень: ${hero.level}\nСтихия: ${hero.element}")

}
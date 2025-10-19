class Student {
    var name: String = "Забыл"
    var age: Int = 1
    fun init(name: String, age: Int){
        this.name = name
        this.age = age
        println("Cоздан студент")
    }
    fun introduce(){
        println("Меня зовут $name. Мне $age лет.")
    }
    fun haveBirthday(){
        age += 1
        println("$name празднует свой день рождения! Теперь ему $age лет .")
    }

}
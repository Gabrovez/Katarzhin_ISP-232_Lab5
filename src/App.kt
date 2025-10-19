fun main(){
    val student = Student()
    print("Введите имя: ")
    val name = readln()
    print("Введите возраст: ")
    val age = readln().toInt()
    student.init(name,age)
    student.introduce()
    student.haveBirthday()
}
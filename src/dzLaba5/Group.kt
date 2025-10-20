package dzLaba5

class Group {
    var nam: String = "Забыл"
    var students = mutableListOf<Student>()
    fun init(nam: String){
        this.nam = nam
        println("Cоздана группа")
    }
    fun addStudent(student: Student){
        students.add(student)
        println("Студент ${student.name} добавлен в группу $nam")
    }
    fun listStudents(){
        println("Студенты группы $nam:")
        for (student in students){
            student.introduce()
        }
    }
    fun celebrateBirthdays(){
        println("В группе $nam празднуют дни рождения!")
        for (student in students){
            student.haveBirthday()
        }
    }

}
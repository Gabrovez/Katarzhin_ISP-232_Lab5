fun main(){
    val student1 = Student()
    student1.init("Гриша", 18)
    val student2 = Student()
    student2.init("Антон", 19)
    val group = Group()
    group.init("ИСП-232")
    group.addStudent(student1)
    group.addStudent(student2)
    println()
    group.listStudents()
    println()
    group.celebrateBirthdays()
    println()
    group.listStudents()

}
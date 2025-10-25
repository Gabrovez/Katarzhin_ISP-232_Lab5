package files

import java.io.File

fun main(){
    val file = File("toDo.txt")
    println("Welcome to To-Do App!")
    while (true){
        println("\n=== Task Menu ===")
        println("1 - Add Task")
        println("2 - Show all tasks")
        println("3 - Delete tasks")
        println("0 - Exit")
        print("Select an action: ")
        when (readln()){
            "1" -> {
                print("Enter a new task: ")
                val task =readln()
                file.appendText("$task\n")
                println("Task added")
            }
            "2" -> {
                println("All tasks:")
                if (file.exists() && file.readLines().isNotEmpty()){
                    file.readLines().forEachIndexed { index, task -> println("${index + 1}. $task")  }
                }else{
                    println("! Task list is empty.")
                }
            }
            "3" -> {
                val tasks = file.readLines().toMutableList()
                if (tasks.isEmpty()){
                    println("Task list is empty.")
                }else{
                    println("Tasks for delete:")
                    tasks.forEachIndexed { index, task -> println("${index + 1}. $task")   }
                }
                print("Enter the task number to delete: ")
                val num =readln().toIntOrNull()
                if (num == null || num !in 1..tasks.size){
                    println("Incorrect number")
                }else{
                    val removed = tasks.removeAt(num - 1)
                    file.writeText("")
                    tasks.forEach { file.appendText("$it\n") }
                    println("Task \"$removed\" deleted.")
                }
            }
            "0" -> {
                println("Exit from the app.")
                break
            }
            else -> println("Incorrect input. Try again.")
        }




    }


}
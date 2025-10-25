package files

import java.io.File

fun main(){
    val file = File("toDo.txt")
    println("Welcome to To-Do App!")
    while (true){
        print("Enter a task (or 0 to exit): ")
        val userInput = readln()
        if (userInput == "0"){
            break
        }else{
            file.appendText("UserInput\n")
            println("Task saved!")
        }
    }

    println("\n Your To-DO list:")
    println(file.readText())
}
package view.pages

import controllers.consoleController.Controller
import java.util.*
import kotlin.system.exitProcess

class AccountMenuPage: Page() {
    override fun getCommand(){
        val scanner = Scanner(System.`in`)
        while (true) {
            val command = scanner.nextLine()
            when {
                command.matches("create .*".toRegex()) -> {
                    println("password:")
                    val pass = scanner.nextLine()
                    Controller.signUp(command.split(" ")[1], pass)
                }
                command.matches("login .*".toRegex()) -> {
                    println("password:")
                    val pass = scanner.nextLine()
                    Controller.signIn(command.split(" ")[1], pass)
                }
                command.matches("show".toRegex()) -> {
                    Controller.showUsers()
                }
                command.matches("help".toRegex()) -> {
                    help()
                }
                command.matches("exit".toRegex()) -> {
                    exitProcess(0)
                }
                else -> {
                    //invalid commend
                    println("invalid command")
                }
            }
        }
    }

    override fun help() {
        super.help()
    }

    override fun showMenu() {
        println("######## sign in ########")
    }
}
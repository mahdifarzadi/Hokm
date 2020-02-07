package view.pages

import controllers.consoleController.Controller
import java.util.*
import kotlin.system.exitProcess

class AccountMenuPage: Page() {

    init {
        showMenu()
        getCommand()
    }

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

                }
                command.matches("logout".toRegex()) -> {

                }
                command.matches("show".toRegex()) -> {
                    Controller.showUsers()
                }
                command.matches("exit".toRegex()) -> {
                    exitProcess(0)
                }
            }
        }
    }

    override fun showMenu() {
        println("######## account ########")
    }
}
package view.pages

import controllers.consoleController.Controller
import model.user.User
import java.util.*
import kotlin.system.exitProcess

class MainMenuPage: Page() {
    override fun getCommand() {
        val scanner = Scanner(System.`in`)
        while (true) {
            val command = scanner.nextLine()
            when {
                command.matches("play".toRegex()) -> {
                }
                command.matches("logout".toRegex()) -> {
                    Controller.signOut()
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
        println("######## menu ######## <${User.user.name}>")
    }
}
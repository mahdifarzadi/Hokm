package controllers.consoleController

import model.user.User

class Controller {
    companion object {

        fun signUp(userName: String, password: String) {
            User.users.forEach {
                if (it.name == userName){
                    //show error
                    println("error")
                    return
                }
            }
            User.signUp(userName, password)
        }

        fun showUsers(){
            User.users.forEach {
                println("${it.name}, ${it.password}")
            }
        }
    }
}
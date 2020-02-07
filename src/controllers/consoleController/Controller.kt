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
            println("signed up")
        }

        fun signIn(userName: String, password: String) {
            User.users.forEach {
                if (it.name == userName){
                    if (it.password == password){
                        //sign in
                        User.signIn(userName)
                        println("signed in")
                    } else println("error") //show error
                    return
                }
            }
            //not found
            println("not found")
        }

        fun showUsers(){
            User.users.forEach {
                println("${it.name}, ${it.password}")
            }
//            println("${User.user.name}, ${User.user.password}")
        }
    }
}
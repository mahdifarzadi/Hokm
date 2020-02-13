package controllers.consoleController

import model.user.User
import view.pages.AccountMenuPage
import view.pages.MainMenuPage
import view.pages.Page

class Controller {
    companion object {

        ///////////////////////////account///////////////////////////////

        fun signUp(userName: String, password: String) {
            User.users.forEach {
                if (it.name == userName){
                    //show error
                    println("error")
                    return
                }
            }
            User.signUp(userName, password)
//            Page.go(MainMenuPage())
            MainMenuPage()
        }

        fun signIn(userName: String, password: String) {
            User.users.forEach {
                if (it.name == userName){
                    if (it.password == password){
                        //sign in
                        User.signIn(userName)
//                        Page.go(MainMenuPage())
                        MainMenuPage()
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



        //////////////////////////main menu//////////////////////////////

        fun signOut(){
            User.user = User("guest", "1234")
            AccountMenuPage()
        }
    }
}
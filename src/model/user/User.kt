package model.user

class User(var name: String, var password: String){
    companion object {
        val users: ArrayList<User> = ArrayList()
        var user = User("guest", "1234")

        fun signUp(userName: String, password: String){
            val user = User(userName, password)
            users.add(user)
            this.user = user
        }

        fun signIn(userName: String){
            users.forEach {
                if (it.name == userName)
                    this.user = it
            }
        }
    }

}
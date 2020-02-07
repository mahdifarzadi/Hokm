package view.pages

import model.user.User
import java.util.*

class Page {
    val user = User.getUser()
    private val pages: Deque<Page> = LinkedList<Page>()

    fun push(newPage: Page){
        pages.push(newPage)
    }

    fun pop(){
        pages.pop()
    }
}
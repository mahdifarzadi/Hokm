package view.pages

import model.user.User
import java.util.*

abstract class Page {
    //open val user = User.getUser()

    companion object {
        private val pages: Deque<Page> = LinkedList<Page>()

        fun go(newPage: Page) {
            pages.push(newPage)
        }

        fun back() {
            pages.pop()
        }
    }

    open fun getCommand() {}

    open fun help() {}

    open fun showMenu() {}
}
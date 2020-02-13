package view.pages

import java.util.*

abstract class Page {

    companion object {
        /*val pages: Deque<Page> = LinkedList<Page>()

        fun go(newPage: Page) {
            pages.push(newPage)
        }

        fun back() {
            if (pages.peek() != null)
                pages.pop()
            else println("err in pop")
        }*/
    }

    init {
        showMenu()
        getCommand()
    }

    open fun getCommand() {}

    open fun help() {}

    open fun showMenu() {}
}
package me.kjgleh.designpattern.iterator

data class BookShelfIterator(
    val bookshelf: BookShelf,
    var index: Int = 0
) : Iterator<Any> {

    override fun hasNext(): Boolean {
        return index < bookshelf.getLength()
    }

    override fun next(): Any {
        val book = bookshelf.getBookAt(index)
        index++
        return book
    }
}
package me.kjgleh.designpattern.iterator

data class BookShelf(
    private var books: MutableList<Book>
) : Aggregate {

    constructor(maxSize: Int) : this(
        books = MutableList(maxSize) {
            Book()
        }
    )

    private var last: Int = 0

    fun getBookAt(index: Int): Book {
        return books[index]
    }

    fun appendBook(book: Book) {
        this.books[last] = book
        last++
    }

    fun getLength(): Int {
        return last
    }

    override fun iterator(): Iterator<*> {
        return BookShelfIterator(this)
    }
}

package me.kjgleh.designpattern.iterator

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BookShelfTest {

    @Test
    fun `test bookShelf iterator`() {
        // Arrange
        val bookShelf = BookShelf(4)
        bookShelf.appendBook(Book("name1"))
        bookShelf.appendBook(Book("name2"))
        bookShelf.appendBook(Book("name3"))
        bookShelf.appendBook(Book("name4"))

        val sut = bookShelf.iterator()

        // Act & Assert
        var index = 0
        while (sut.hasNext()) {
            val book = sut.next() as Book
            assertThat(book.name).isEqualTo(bookShelf.getBookAt(index).name)
            index++
        }
    }
}
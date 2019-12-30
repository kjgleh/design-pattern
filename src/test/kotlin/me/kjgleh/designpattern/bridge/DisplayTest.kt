package me.kjgleh.designpattern.bridge

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DisplayTest {

    @Test
    fun `display correctly`() {
        // Arrange
        val displayImpl = StringDisplayImpl("hello")
        val display = Display(displayImpl)

        // Act
        val actual = display.display()

        // Assert
        assertThat(actual).contains("open")
        assertThat(actual).contains("print hello")
        assertThat(actual).contains("close")
    }
}
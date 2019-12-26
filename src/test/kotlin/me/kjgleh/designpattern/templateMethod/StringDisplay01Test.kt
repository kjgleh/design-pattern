package me.kjgleh.designpattern.templateMethod

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StringDisplay01Test {

    @Test
    fun `display returns string correctly`() {
        // Arrange
        val string = "test"
        val sut: AbstractDisplay = StringDisplay01(
            string = string
        )

        // Act
        val actual = sut.display(string)

        // Assert
        assertThat(actual).isEqualTo("<<<$string$string>>>")
    }
}
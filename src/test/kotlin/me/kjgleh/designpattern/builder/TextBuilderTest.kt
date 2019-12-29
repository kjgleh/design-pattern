package me.kjgleh.designpattern.builder

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TextBuilderTest {

    @Test
    fun `getResult returns string correctly`() {
        // Arrange
        val textBuilder = TextBuilder()
        val director = Director(textBuilder)

        // Act
        director.construct()
        val actual = textBuilder.getResult()

        // Assert
        assertThat(actual).contains("hey")
        assertThat(actual).contains("first item")
        assertThat(actual).contains("hello world")
    }
}
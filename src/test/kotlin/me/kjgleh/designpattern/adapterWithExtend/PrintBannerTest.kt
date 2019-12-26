package me.kjgleh.designpattern.adapterWithExtend

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PrintBannerTest {

    @Test
    fun `printWeak return string correctly`() {
        // Arrange
        val string = "test"
        val sut = PrintBanner(
            string = string
        )

        // Act
        val actual = sut.printWeak()

        // Assert
        assertThat(actual).isEqualTo("($string)")
    }

    @Test
    fun `printStrong return string correctly`() {
        // Arrange
        val string = "test"
        val sut = PrintBanner(
            string = string
        )

        // Act
        val actual = sut.printStrong()

        // Assert
        assertThat(actual).isEqualTo("*$string*")
    }
}
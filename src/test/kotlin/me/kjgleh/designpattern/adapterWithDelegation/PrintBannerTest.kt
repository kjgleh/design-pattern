package me.kjgleh.designpattern.adapterWithDelegation

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PrintBannerTest {

    @Test
    fun `printWeak returns string correctly`() {
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
    fun `printStrong returns string correctly`() {
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
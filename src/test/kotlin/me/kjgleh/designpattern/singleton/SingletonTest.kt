package me.kjgleh.designpattern.singleton

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SingletonTest {

    @Test
    fun `test singleton`() {
        // Arrange
        val singleton = Singleton.getInstance()
        val singleton2 = Singleton.getInstance()

        // Act && Assert
        assertThat(singleton).isEqualTo(singleton2)
    }

    @Test
    fun `test notSingleton`() {
        // Arrange
        val instance01 = NotSingleton()
        val instance02 = NotSingleton()

        // Act && Assert
        assertThat(instance01).isNotEqualTo(instance02)
    }
}
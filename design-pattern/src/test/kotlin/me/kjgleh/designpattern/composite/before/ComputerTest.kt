package me.kjgleh.designpattern.composite.before

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class ComputerTest {

    @Test
    fun computer_price_return_price_correctly() {
        // Arrange
        val body = Body(100, 70)
        val keyboard = Keyboard(10, 7)

        val computer = Computer()
        computer.addBody(body)
        computer.addKeyboard(keyboard)

        // Act
        val actual = computer.price

        // Assert
        assertThat(actual).isEqualTo(110)
    }
}
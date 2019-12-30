package me.kjgleh.designpattern.observer

import org.junit.jupiter.api.Test

internal class RandomNumberGeneratorTest {

    @Test
    fun `test execute`() {
        // Arrange
        val numberGenerator: NumberGenerator = RandomNumberGenerator()
        val digitObserver = DigitObserver()
        val graphObserver = GraphObserver()
        numberGenerator.addObserver(digitObserver)
        numberGenerator.addObserver(graphObserver)

        // Act
        numberGenerator.execute()
    }
}
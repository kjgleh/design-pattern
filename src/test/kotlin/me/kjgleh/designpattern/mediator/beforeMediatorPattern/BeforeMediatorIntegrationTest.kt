package me.kjgleh.designpattern.mediator.beforeMediatorPattern

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class BeforeMediatorIntegrationTest {

    private lateinit var button: Button
    private lateinit var fan: Fan

    @BeforeEach
    fun setUp() {
        this.fan = Fan()
        this.button = Button(fan)
    }

    @Test
    fun givenTurnedOffFan_whenPressingButtonTwice_fanShouldTurnOnAndOff() {
        // Assert
        assertThat(fan.isOn).isFalse()

        button.press()
        assertThat(fan.isOn).isTrue()

        button.press()
        assertThat(fan.isOn).isFalse()
    }
}
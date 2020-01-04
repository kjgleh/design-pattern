package me.kjgleh.designpattern.mediator.afterMediatorPattern

import me.kjgleh.designpattern.mediator.beforeMediatorPattern.PowerSupplier
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class AfterMediatorIntegrationTest {

    private lateinit var fan: Fan
    private lateinit var button: Button

    @BeforeEach
    fun setUp() {
        this.fan = Fan()
        this.button = Button()
        val powerSupplier = PowerSupplier()
        val mediator = Mediator()
        mediator.setFan(fan)
        mediator.setButton(button)
        mediator.powerSupplier = powerSupplier
    }

    @Test
    fun givenTurnedOffFan_whenPressingButtonTwice_fanShouldTurnOnAndOff() {
        assertThat(fan.isOn).isFalse()

        button.press()
        assertThat(fan.isOn).isTrue()

        button.press()
        assertThat(fan.isOn).isFalse()
    }
}
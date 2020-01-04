package me.kjgleh.designpattern.mediator.afterMediatorPattern

import me.kjgleh.designpattern.mediator.beforeMediatorPattern.PowerSupplier

class Mediator {

    private lateinit var fan: Fan
    private lateinit var button: Button
    lateinit var powerSupplier: PowerSupplier

    fun setButton(button: Button) {
        this.button = button
        this.button.mediator = this
    }

    fun setFan(fan: Fan) {
        this.fan = fan
        this.fan.mediator = this
    }

    fun press() {
        if (fan.isOn) fan.turnOff()
        else fan.turnOn()
    }

    fun start() {
        powerSupplier.turnOn()
    }

    fun stop() {
        powerSupplier.turnOff()
    }
}
package me.kjgleh.designpattern.mediator.beforeMediatorPattern

class Button(
    private val fan: Fan
) {
    fun press() {
        if (fan.isOn) fan.turnOff()
        else fan.turnOn()
    }
}
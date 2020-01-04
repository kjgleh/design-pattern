package me.kjgleh.designpattern.mediator.beforeMediatorPattern

class Fan {
    private val powerSupplier = PowerSupplier()
    var isOn = false
        private set

    fun turnOn() {
        isOn = true
        powerSupplier.turnOn()
    }

    fun turnOff() {
        isOn = false
        powerSupplier.turnOff()
    }
}

package me.kjgleh.designpattern.mediator.afterMediatorPattern

class Fan {
    lateinit var mediator: Mediator
    var isOn = false
        private set

    fun turnOn() {
        mediator.start()
        isOn = true
    }

    fun turnOff() {
        isOn = false
        mediator.stop()
    }
}

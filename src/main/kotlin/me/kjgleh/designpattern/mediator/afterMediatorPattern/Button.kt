package me.kjgleh.designpattern.mediator.afterMediatorPattern

class Button {
    lateinit var mediator: Mediator

    fun press() {
        mediator.press()
    }
}
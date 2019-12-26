package me.kjgleh.designpattern.composite.after

class Keyboard(
    override var price: Int = 0,
    override var power: Int = 0
): ComputerDevice()
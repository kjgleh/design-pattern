package me.kjgleh.designpattern.composite.after

class Body(
    override var price: Int = 0,
    override var power: Int = 0
): ComputerDevice()
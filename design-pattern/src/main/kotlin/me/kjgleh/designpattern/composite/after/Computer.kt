package me.kjgleh.designpattern.composite.after

class Computer: ComputerDevice() {

    private val components = mutableListOf<ComputerDevice>()

    fun addComponent(computerDevice: ComputerDevice) {
        components.add(computerDevice)
    }

    override val price: Int
        get() {
            return components.sumBy { it.price }
        }

    override val power: Int
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
}
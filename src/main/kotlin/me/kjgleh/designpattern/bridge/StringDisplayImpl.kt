package me.kjgleh.designpattern.bridge

class StringDisplayImpl(val string: String): DisplayImpl() {
    override fun rawOpen(): String {
        return "open"
    }

    override fun rawPrint(): String {
        return "print $string"
    }

    override fun rawClose(): String {
        return "close"
    }
}
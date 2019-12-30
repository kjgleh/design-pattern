package me.kjgleh.designpattern.bridge

abstract class DisplayImpl {
    abstract fun rawOpen(): String
    abstract fun rawPrint(): String
    abstract fun rawClose(): String
}

package me.kjgleh.designpattern.abstractFactory.factory

abstract class Item(
    protected open var caption: String
) {
    abstract fun makeHTML(): String
}
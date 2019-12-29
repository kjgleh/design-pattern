package me.kjgleh.designpattern.abstractFactory.factory

import me.kjgleh.designpattern.abstractFactory.factory.Item

abstract class Tray(
    override var caption: String
): Item(caption) {
    protected var tray = mutableListOf<Item>()
    fun add(item: Item) {
        tray.add(item)
    }
}
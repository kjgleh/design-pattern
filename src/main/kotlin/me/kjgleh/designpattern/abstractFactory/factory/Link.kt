package me.kjgleh.designpattern.abstractFactory.factory

import me.kjgleh.designpattern.abstractFactory.factory.Item

abstract class Link(
    override var caption: String,
    open var url: String
): Item(caption) {
}
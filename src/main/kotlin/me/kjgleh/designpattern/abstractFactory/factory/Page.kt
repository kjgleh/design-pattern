package me.kjgleh.designpattern.abstractFactory.factory

import me.kjgleh.designpattern.abstractFactory.factory.Item

abstract class Page(
    open var title: String,
    open var author: String
) {
    protected val content = mutableListOf<Item>()

    fun add(item: Item) {
        content.add(item)
    }

    fun output(): String {
        try {
            return this.makeHTML()
        } catch (e: Exception) {
            throw e
        }
    }

    abstract fun makeHTML(): String
}
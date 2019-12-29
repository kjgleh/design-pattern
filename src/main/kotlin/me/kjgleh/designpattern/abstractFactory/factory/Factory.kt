package me.kjgleh.designpattern.abstractFactory.factory

abstract class Factory {
    companion object {
        fun getFactory(className: String) {
            var factory: Factory? = null
            try {
                factory = Class.forName(className).newInstance() as Factory
            } catch (e: Exception) {
                throw e
            }
        }
    }
    abstract fun createLink(caption: String, url: String): Link
    abstract fun createTray(caption: String): Tray
    abstract fun createPage(title: String, author: String): Page
}
package me.kjgleh.designpattern.abstractFactory.list

import me.kjgleh.designpattern.abstractFactory.factory.Factory
import me.kjgleh.designpattern.abstractFactory.factory.Link
import me.kjgleh.designpattern.abstractFactory.factory.Page
import me.kjgleh.designpattern.abstractFactory.factory.Tray

class ListFactory: Factory() {
    override fun createLink(caption: String, url: String): Link {
        return ListLink(caption, url)
    }

    override fun createTray(caption: String): Tray {
        return ListTray(caption)
    }

    override fun createPage(title: String, author: String): Page {
        return ListPage(title, author)
    }
}
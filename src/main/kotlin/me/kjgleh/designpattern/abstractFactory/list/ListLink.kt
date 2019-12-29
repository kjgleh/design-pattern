package me.kjgleh.designpattern.abstractFactory.list

import me.kjgleh.designpattern.abstractFactory.factory.Link

class ListLink(
    override var caption: String,
    override var url: String
): Link(caption, url) {
    override fun makeHTML(): String {
        return """<li><a href="$url">$caption</a></li>"""
    }
}
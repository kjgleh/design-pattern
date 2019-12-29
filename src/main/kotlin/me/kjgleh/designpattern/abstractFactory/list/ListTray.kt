package me.kjgleh.designpattern.abstractFactory.list

import me.kjgleh.designpattern.abstractFactory.factory.Tray
import java.lang.StringBuilder

class ListTray(
    override var caption: String
): Tray(caption) {
    override fun makeHTML(): String {
        val stringBuilder = StringBuilder()
        stringBuilder.append("<li>\n")
        stringBuilder.append("$caption\n")
        stringBuilder.append("<ul>\n")
        tray.forEach {
            stringBuilder.append(it.makeHTML())
        }
        stringBuilder.append("</ul>\n")
        stringBuilder.append("</li>\n")
        return stringBuilder.toString()
    }
}
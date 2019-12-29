package me.kjgleh.designpattern.builder

import java.lang.StringBuilder

class TextBuilder: Builder() {

    private val stringBuilder = StringBuilder()

    override fun makeHeader(header: String) {
        stringBuilder.append("<header>")
        stringBuilder.append(header)
        stringBuilder.append("</header>")
    }

    override fun makeString(body: String) {
        stringBuilder.append("<p>")
        stringBuilder.append(body)
        stringBuilder.append("</p>")
    }

    override fun makeItem(footer: String) {
        stringBuilder.append("<ul>")
        stringBuilder.append("<li>")
        stringBuilder.append(footer)
        stringBuilder.append("</li>")
        stringBuilder.append("</ul>")
    }

    fun getResult(): String {
        return stringBuilder.toString()
    }
}
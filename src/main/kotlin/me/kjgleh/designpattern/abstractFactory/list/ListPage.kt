package me.kjgleh.designpattern.abstractFactory.list

import me.kjgleh.designpattern.abstractFactory.factory.Page
import java.lang.StringBuilder

class ListPage(
    override var title: String,
    override var author: String
): Page(title, author) {
    override fun makeHTML(): String {
        val stringBuilder = StringBuilder()
        stringBuilder.append("<html>")
        stringBuilder.append("<head>")
        stringBuilder.append("<title>")
        stringBuilder.append(title)
        stringBuilder.append("</title>")
        stringBuilder.append("<body>")
        stringBuilder.append("<ul>")
        content.forEach {
            stringBuilder.append(it.makeHTML())
        }
        stringBuilder.append("</ul>")
        stringBuilder.append("<address>")
        stringBuilder.append(author)
        stringBuilder.append("</address>")
        stringBuilder.append("</body>")
        stringBuilder.append("</html>")
        return stringBuilder.toString()
    }

}
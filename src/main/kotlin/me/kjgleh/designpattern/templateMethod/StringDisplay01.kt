package me.kjgleh.designpattern.templateMethod

class StringDisplay01(
    var string: String
): AbstractDisplay() {
    override fun open(): String {
        return "<<<"
    }

    override fun print(string: String): String {
        return "$string$string"
    }

    override fun close(): String {
        return ">>>"
    }
}
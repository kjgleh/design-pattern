package me.kjgleh.designpattern.templateMethod

import java.lang.StringBuilder

abstract class AbstractDisplay {

    abstract fun open(): String
    abstract fun print(string: String): String
    abstract fun close(): String

    fun display(string: String): String {
        val open = open()
        val print = print(string)
        val close = close()

        val stringBuilder = StringBuilder()
        stringBuilder.append(open)
        stringBuilder.append(print)
        stringBuilder.append(close)

        return stringBuilder.toString()
    }
}
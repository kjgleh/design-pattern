package me.kjgleh.designpattern.bridge

import java.lang.StringBuilder

open class Display(
    open val displayImpl: DisplayImpl
) {
    fun open(): String {
        return displayImpl.rawOpen()
    }

    fun print(): String {
        return displayImpl.rawPrint()
    }

    fun close(): String {
        return displayImpl.rawClose()
    }

    fun display(): String {
        val stringBuilder = StringBuilder()
        stringBuilder.append(open())
        stringBuilder.append(print())
        stringBuilder.append(close())
        return stringBuilder.toString()
    }
}
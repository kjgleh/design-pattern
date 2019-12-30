package me.kjgleh.designpattern.bridge

import java.lang.StringBuilder

class CountDisplay(
    override var displayImpl: DisplayImpl
): Display(displayImpl) {
    fun multiDisplay(times: Int): String {
        val stringBuilder = StringBuilder()
        stringBuilder.append(open())
        repeat(times) {
            stringBuilder.append(print())
        }
        stringBuilder.append(close())
        return stringBuilder.toString()
    }
}
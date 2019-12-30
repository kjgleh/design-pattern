package me.kjgleh.designpattern.observer

import java.lang.Exception

class DigitObserver: Observer {
    override fun update(generator: NumberGenerator) {
        println("DigitObserver ${generator.getNumber()}")
        try {
            Thread.sleep(100)
        } catch (e: Exception) {

        }
    }
}
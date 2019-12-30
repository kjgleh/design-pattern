package me.kjgleh.designpattern.observer

import java.lang.Exception

class GraphObserver: Observer {
    override fun update(generator: NumberGenerator) {
        print("GraphObserver")
        repeat(generator.getNumber()) {
            print("*")
        }
        println("")
        try {
            Thread.sleep(100)
        } catch (e: Exception) {}
    }
}
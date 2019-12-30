package me.kjgleh.designpattern.observer

import java.util.*

class RandomNumberGenerator: NumberGenerator() {

    private var number: Int = 0
    private var random = Random()

    override fun getNumber(): Int {
        return number
    }

    override fun execute() {
        repeat(20) {
            number = random.nextInt(50)
            notifyObservers()
        }
    }
}
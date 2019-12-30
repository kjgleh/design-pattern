package me.kjgleh.designpattern.observer

interface Observer {
    fun update(generator: NumberGenerator)
}
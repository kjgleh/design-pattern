package me.kjgleh.designpattern.strategy.before

abstract class Robot(
        open val name: String
) {
    abstract fun attack()
    abstract fun move()
}
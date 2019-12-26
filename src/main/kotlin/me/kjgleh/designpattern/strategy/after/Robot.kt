package me.kjgleh.designpattern.strategy.after

abstract class Robot(
        open val name: String
) {
    var movingStrategy: MovingStrategy? = null
    var attachStrategy: AttackStrategy? = null

    fun move() {
        movingStrategy?.move()
    }
}
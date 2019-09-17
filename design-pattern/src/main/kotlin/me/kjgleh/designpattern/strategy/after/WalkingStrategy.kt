package me.kjgleh.designpattern.strategy.after

class WalkingStrategy: MovingStrategy {
    override fun move() {
        println("walk")
    }
}
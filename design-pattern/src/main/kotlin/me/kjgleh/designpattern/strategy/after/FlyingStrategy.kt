package me.kjgleh.designpattern.strategy.after

class FlyingStrategy: MovingStrategy {
    override fun move() {
        println("fly")
    }
}
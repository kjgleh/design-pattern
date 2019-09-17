package me.kjgleh.designpattern.strategy.after

import org.junit.Test

class RobotTest {

    @Test
    fun robotTest() {
        // Arrange
        val atom: Robot = Atom("atom")
        atom.movingStrategy = FlyingStrategy()

        val taekwonV: Robot = Atom("taekwonV")
        taekwonV.movingStrategy = WalkingStrategy()

        // Act && Assert
        atom.move()
        taekwonV.move()
    }
}
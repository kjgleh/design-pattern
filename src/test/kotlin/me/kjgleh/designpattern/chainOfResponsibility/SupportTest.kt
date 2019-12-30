package me.kjgleh.designpattern.chainOfResponsibility

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SupportTest {

    @Test
    fun `resolve correctly`() {
        // Arrange
        val alice = NoSupport("alice")
        val bob = LimitSupport("bob", 5)
        val fred = OddSupport("fred")

        alice.setNext(bob).setNext(fred)

        // Act
        val actual = alice.support(Trouble(10))

        // Assert
        assertThat(actual).isNotNull()
    }
}
package me.kjgleh.designpattern.proxy

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PrintProxyTest {

    @Test
    fun `print correctly`() {
        // Arrange && Assert
        val printProxy = PrintProxy("Alice")

        assertThat(printProxy.getPrintName()).isEqualTo("Alice")

        printProxy.setPrintName("Bob")

        assertThat(printProxy.getPrintName()).isEqualTo("Bob")

        assertThat(printProxy.print("test")).isEqualTo("Bob test")
    }
}
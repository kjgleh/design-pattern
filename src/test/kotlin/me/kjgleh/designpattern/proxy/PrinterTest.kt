package me.kjgleh.designpattern.proxy

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

internal class PrinterTest {

    @Test
    fun `print correctly`() {
        // Arrange && Assert
        val printProxy = Printer("Alice")

        Assertions.assertThat(printProxy.getPrintName()).isEqualTo("Alice")

        printProxy.setPrintName("Bob")

        Assertions.assertThat(printProxy.getPrintName()).isEqualTo("Bob")

        Assertions.assertThat(printProxy.print("test")).isEqualTo("Bob test")
    }
}
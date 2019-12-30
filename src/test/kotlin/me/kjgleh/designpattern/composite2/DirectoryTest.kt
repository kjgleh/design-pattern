package me.kjgleh.designpattern.composite2

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DirectoryTest {

    @Test
    fun `add correctly`() {
        // Arrange && Act
        val rootDir = Directory("root")
        val binDir = Directory("bin")
        val tempDir = Directory("temp")

        rootDir.add(binDir)
        rootDir.add(tempDir)
        binDir.add(File("bin file", 1000))
        binDir.add(File("bin2 file", 3000))
        tempDir.add(File("temp", 2000))

        // Assert
        assertThat(rootDir.size).isEqualTo(6000)
    }
}
package me.kjgleh.designpattern.state

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

internal class SafeFrameTest {

    @ParameterizedTest
    @ValueSource(ints = [9, 10, 16])
    fun `doUse in working hours returns string correctly`(hour: Int) {
        // Arrange
        val safeFrame = SafeFrame()
        safeFrame.setClock(hour)

        // act
        val actual = safeFrame.doUse()

        // Assert
        assertThat(actual).isEqualTo("record 금고사용(주간)")
    }

    @ParameterizedTest
    @ValueSource(ints = [8, 17, 18])
    fun `doUse in not working hours return string correctly`(hour: Int) {
        // Arrange
        val safeFrame = SafeFrame()
        safeFrame.setClock(hour)

        // act
        val actual = safeFrame.doUse()

        // Assert
        assertThat(actual).isEqualTo("call 비상: 야간금고 사용")
    }
}
package me.kjgleh.designpattern.factoryMethod

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

internal class IDCardFactoryTest {

    companion object {
        @JvmStatic
        fun ownerAndExpectedUse(): Stream<Arguments> {
            return Stream.of(
                Arguments.of("test1", "use test1's card"),
                Arguments.of("test2", "use test2's card"),
                Arguments.of("test3", "use test3's card")
            )
        }
    }

    @ParameterizedTest
    @MethodSource("ownerAndExpectedUse")
    fun `test use`(owner: String, expectedUse: String) {
        // Arrange
        val idCardFactory: Factory = IDCardFactory()
        val card = idCardFactory.create(owner)

        // Act
        val actual = card.use()

        // Assert
        assertThat(actual).isEqualTo(expectedUse)
    }
}
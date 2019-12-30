package me.kjgleh.designpattern.facade

import org.junit.jupiter.api.Test
import org.mockito.Mockito
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean

@SpringBootTest(classes = [SendFacade::class])
internal class SendFacadeTest {

    @Autowired
    private lateinit var sendFacade: SendFacade

    @MockBean
    private lateinit var mailSender: MailSender

    @MockBean
    private lateinit var vocSender: VocSender

    @Test
    fun `test send`() {
        // Arrange
        val sut = sendFacade

        // Act
        sut.send("test@gmail.com")

        // Assert
        Mockito.verify(mailSender).sendMail("test@gmail.com")
        Mockito.verify(vocSender).send()
    }
}
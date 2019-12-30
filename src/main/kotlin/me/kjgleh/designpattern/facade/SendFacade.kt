package me.kjgleh.designpattern.facade

class SendFacade(
    private val mailSender: MailSender,
    private val vocSender: VocSender
) {
    fun send(mailAddr: String) {
        mailSender.sendMail(mailAddr)
        vocSender.send()
    }
}
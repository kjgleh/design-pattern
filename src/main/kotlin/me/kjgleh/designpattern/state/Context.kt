package me.kjgleh.designpattern.state

interface Context {
    fun setClock(hour: Int)
    fun changeState(instance: State)
    fun callSecurityCenter(msg: String): String
    fun recordLog(msg: String): String
}

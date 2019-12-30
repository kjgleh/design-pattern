package me.kjgleh.designpattern.state

class SafeFrame: Context {

    private var state: State = DayState()

    override fun setClock(hour: Int) {
        state.doClock(this, hour)
    }

    override fun changeState(state: State) {
        this.state = state
    }

    override fun callSecurityCenter(msg: String): String {
        return "call $msg"
    }

    override fun recordLog(msg: String): String {
        return "record $msg"
    }

    fun doUse(): String {
        return state.doUse(this)
    }
}
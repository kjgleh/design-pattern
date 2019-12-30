package me.kjgleh.designpattern.state

class NightState: State {
    companion object {
        val instance = NightState()
    }

    override fun doClock(context: Context, hour: Int) {
        if (hour in 9..16) {
            context.changeState(DayState.instance)
        }
    }

    override fun doUse(context: Context): String {
        return context.callSecurityCenter("비상: 야간금고 사용")
    }

    override fun doAlarm(context: Context) {
        context.callSecurityCenter("비상벨(야간)")
    }

    override fun doPhone(context: Context) {
        context.recordLog("야간통화 녹음")
    }
}

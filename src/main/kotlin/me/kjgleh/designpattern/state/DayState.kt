package me.kjgleh.designpattern.state

class DayState: State {
    companion object {
        val instance = DayState()
    }

    override fun doClock(context: Context, hour: Int) {
        if (hour < 9 || hour >= 17) {
            context.changeState(NightState.instance)
        }
    }

    override fun doUse(context: Context): String {
        return context.recordLog("금고사용(주간)")
    }

    override fun doAlarm(context: Context) {
        context.callSecurityCenter("비상벨(주간)")
    }

    override fun doPhone(context: Context) {
        context.callSecurityCenter("일반통화(주간)")
    }
}
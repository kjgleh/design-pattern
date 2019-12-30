package me.kjgleh.designpattern.state

interface State {
    fun doClock(context: Context, hour: Int)
    fun doUse(context: Context): String
    fun doAlarm(context: Context)
    fun doPhone(context: Context)
}
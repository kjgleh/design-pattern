package me.kjgleh.designpattern.adapterWithDelegation

import me.kjgleh.designpattern.adapterWithExtend.Banner

class PrintBanner(
    val string: String
): Print {

    private val banner = Banner(string)

    override fun printWeak(): String {
        return banner.showWithParen()
    }

    override fun printStrong(): String {
        return banner.showWithAster()
    }
}
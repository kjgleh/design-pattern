package me.kjgleh.designpattern.adapterWithExtend

class PrintBanner(override var string: String) : Banner(string), Print {

    override fun printWeak(): String {
        return showWithParen()
    }

    override fun printStrong(): String {
        return showWithAster()
    }
}
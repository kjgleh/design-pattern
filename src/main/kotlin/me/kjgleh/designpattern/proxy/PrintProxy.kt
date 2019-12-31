package me.kjgleh.designpattern.proxy

class PrintProxy(): Printable {
    private lateinit var name: String
    private var printer: Printer? = null

    constructor(name: String) : this() {
        this.name = name
    }

    override fun setPrintName(name: String) {
        printer?.setPrintName(name)
        this.name = name
    }

    override fun getPrintName(): String {
        println("get PrintName : $name")
        return this.name
    }

    override fun print(string: String): String {
        realize()
        return printer!!.print(string)
    }

    private fun realize() {
        if (printer == null) {
            printer = Printer(name)
        }
    }
}
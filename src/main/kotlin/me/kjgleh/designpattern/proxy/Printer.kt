package me.kjgleh.designpattern.proxy

import java.lang.Exception

class Printer(): Printable {
    private lateinit var name: String

    constructor(name: String): this() {
        this.name = name
    }

    init {
        heavyJob()
    }

    override fun setPrintName(name: String) {
        this.name = name
    }

    override fun getPrintName(): String {
        println("get PrintName : $name")
        return name
    }

    override fun print(string: String): String {
        return "$name $string"
    }

    private fun heavyJob() {
        repeat(5) {
            try {
                Thread.sleep(1000)
                println(it)
            } catch (e: Exception) {

            }
        }
        println("created printer instance")
    }
}
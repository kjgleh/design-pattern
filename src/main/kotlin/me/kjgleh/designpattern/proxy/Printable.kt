package me.kjgleh.designpattern.proxy

interface Printable {
    fun setPrintName(name: String)
    fun getPrintName(): String
    fun print(string: String): String
}
package me.kjgleh.designpattern.builder

abstract class Builder {
    abstract fun makeHeader(header: String)
    abstract fun makeString(body: String)
    abstract fun makeItem(footer: String)
}
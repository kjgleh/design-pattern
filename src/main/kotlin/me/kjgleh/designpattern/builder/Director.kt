package me.kjgleh.designpattern.builder

class Director(
    private val builder: Builder
) {
    fun construct() {
        builder.makeHeader("hey")
        builder.makeItem("first item")
        builder.makeString("hello world")
        builder.makeItem("second item")
    }
}
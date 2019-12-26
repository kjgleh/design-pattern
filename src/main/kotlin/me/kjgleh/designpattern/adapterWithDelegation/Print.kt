package me.kjgleh.designpattern.adapterWithDelegation

interface Print {
    fun printWeak(): String
    fun printStrong(): String
}
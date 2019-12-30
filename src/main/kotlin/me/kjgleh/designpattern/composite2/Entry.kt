package me.kjgleh.designpattern.composite2

abstract class Entry {
    abstract val name: String
    abstract val size: Int
    abstract fun printList(prefix: String): String
    open fun add(entry: Entry): Entry {
        throw FileTreatmentException()
    }
}
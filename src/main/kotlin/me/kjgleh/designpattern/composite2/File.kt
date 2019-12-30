package me.kjgleh.designpattern.composite2

class File(
    override val name: String,
    override val size: Int
) : Entry() {
    override fun printList(prefix: String): String {
        return "$prefix file"
    }
}
package me.kjgleh.designpattern.composite2

class Directory(
    override val name: String
) : Entry() {
    private val directory = mutableListOf<Entry>()

    override val size: Int
        get() {
            return directory.sumBy { it.size }
        }

    override fun printList(prefix: String): String {
        return "$prefix directory"
    }

    override fun add(entry: Entry): Entry {
        directory.add(entry)
        return this
    }
}
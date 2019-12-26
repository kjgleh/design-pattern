package me.kjgleh.designpattern.factoryMethod

class IDCard(
    val owner: String
) : Product() {

    override fun use(): String {
        return "use $owner's card"
    }
}
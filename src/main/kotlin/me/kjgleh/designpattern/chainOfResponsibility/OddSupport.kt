package me.kjgleh.designpattern.chainOfResponsibility

class OddSupport(
    override var name: String
): Support(name) {
    override fun resolve(trouble: Trouble): Boolean {
        return trouble.number % 2 == 1
    }
}
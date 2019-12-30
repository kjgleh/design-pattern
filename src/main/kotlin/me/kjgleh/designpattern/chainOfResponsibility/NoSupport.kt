package me.kjgleh.designpattern.chainOfResponsibility

class NoSupport(
    override var name: String
): Support(name) {
    override fun resolve(trouble: Trouble): Boolean {
        return false
    }
}
package me.kjgleh.designpattern.chainOfResponsibility

class LimitSupport(
    override var name: String,
    private val limit: Int
): Support(name) {
    override fun resolve(trouble: Trouble): Boolean {
        return trouble.number < limit
    }
}
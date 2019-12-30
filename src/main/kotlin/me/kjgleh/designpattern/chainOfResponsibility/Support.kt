package me.kjgleh.designpattern.chainOfResponsibility

abstract class Support(
    open val name: String
) {
    private var next: Support? = null
    fun setNext(next: Support): Support {
        this.next = next
        return next
    }

    fun support(trouble: Trouble): String {
        return when {
            resolve(trouble) -> done(trouble)
            next != null -> {
                next!!.support(trouble)
            }
            else -> {
                fail(trouble)
            }
        }
    }

    fun done(trouble: Trouble): String {
        return "$trouble is resolved by $this"
    }

    fun fail(trouble: Trouble): String {
        return "$trouble cannot be resolved"
    }

    abstract fun resolve(trouble: Trouble): Boolean
}
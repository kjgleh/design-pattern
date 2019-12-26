package me.kjgleh.designpattern.adapterWithExtend

open class Banner(
    open var string: String
) {

    fun showWithParen(): String {
        return "($string)"
    }

    fun showWithAster(): String {
        return "*$string*"
    }
}
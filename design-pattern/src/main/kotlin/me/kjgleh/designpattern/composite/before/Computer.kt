package me.kjgleh.designpattern.composite.before

/**
 * 문제점
 * 컴퓨터 클래스의 부품으로 speaker가 추가된다면..
 * computer클래스도 수정되어야한다. => OCP 위반
 */
class Computer {

    private var body: Body? = null
    private var keyboard: Keyboard? = null
    val price: Int
        get() {
            return (body?.price ?: 0) + (keyboard?.price ?: 0)
        }
    val power: Int
        get() {
            TODO()
        }

    fun addBody(body: Body) {
        this.body = body
    }

    fun addKeyboard(keyboard: Keyboard) {
        this.keyboard = keyboard
    }
}
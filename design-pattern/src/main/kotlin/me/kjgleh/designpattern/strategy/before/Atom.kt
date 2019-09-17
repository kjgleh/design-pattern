package me.kjgleh.designpattern.strategy.before

/**
 * Atom의 attack의 구현내용이 변경되어야 한다면..
 * 새로운 로봇에 Atom과 동일한 내용의 Attack이 추가된다면.. => 중복 문제 발생
 * 무엇이 변화되었는지를 찾은 후에 이를 클래스로 캡슐화한다.
 */
class Atom(
        override var name: String
): Robot(name) {
    override fun attack() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun move() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
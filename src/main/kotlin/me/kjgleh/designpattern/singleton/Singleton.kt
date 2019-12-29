package me.kjgleh.designpattern.singleton

class Singleton private constructor() {

    companion object {
        private val singleton = Singleton()
        fun getInstance() = singleton
    }
}
package me.kjgleh.designpattern.iterator

interface Aggregate {
    fun iterator(): Iterator<*>
}
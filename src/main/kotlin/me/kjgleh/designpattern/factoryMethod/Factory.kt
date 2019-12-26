package me.kjgleh.designpattern.factoryMethod

abstract class Factory {

    protected abstract fun createProduct(owner: String): Product
    protected abstract fun registerProduct(product: Product)

    fun create(owner: String): Product {
        val p = createProduct(owner)
        registerProduct(p)
        return p
    }
}
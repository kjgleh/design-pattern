package me.kjgleh.designpattern.factoryMethod

class IDCardFactory: Factory() {

    private val owners = mutableListOf<String>()

    override fun createProduct(owner: String): Product {
        return IDCard(owner)
    }

    override fun registerProduct(product: Product) {
        val idCard = product as IDCard
        owners.add(idCard.owner)
    }
}
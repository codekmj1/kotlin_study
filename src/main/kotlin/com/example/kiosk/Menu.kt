package com.example.kiosk

open class Menu(val menuName: String, val productList: List<Product>) {
    fun displayProducts() {
        productList.forEachIndexed { index, product ->
            println("${index + 1}. ${product.name} | ${product.price}원")
        }
    }

    fun selectProduct(productNumber: Int): Product {
        return productList[productNumber - 1]
    }

    fun calculateTotal(quantity: Int, product: Product): Int {
        return quantity * product.price
    }
}
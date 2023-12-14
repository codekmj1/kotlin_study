package com.example.kiosk

fun main() {
    println("Sparta Cafe에 오신 것을 환영합니다")

    val coffeeMenu = CoffeeMenu()
    val drinkMenu = DrinkMenu()
    val dessertMenu = DessertMenu()
    val kiosk = Kiosk(listOf(coffeeMenu, drinkMenu, dessertMenu))

    val order = Order(kiosk)
    order.start()

    println("프로그램을 종료합니다.")
}
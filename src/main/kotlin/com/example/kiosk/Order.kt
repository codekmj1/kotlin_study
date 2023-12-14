package com.example.kiosk

class Order(val kiosk: Kiosk) {
    var total = 0

    fun start() {
        while (true) {
            kiosk.displayMenus()
            println("메뉴를 선택하세요. (종료는 0)")

            val menuNumber = readLine()?.toIntOrNull()
            if (menuNumber == null || menuNumber < 0 || menuNumber > kiosk.menus.size) {
                println("올바른 메뉴 번호를 입력하세요.")
                continue
            }
            if (menuNumber == 0) break

            val selectedMenu = kiosk.selectMenu(menuNumber)
            selectedMenu.displayProducts()

            println("상품 번호를 입력하세요.")

            val productNumber = readLine()?.toIntOrNull()
            if (productNumber == null || productNumber < 1 || productNumber > selectedMenu.productList.size) {
                println("올바른 상품 번호를 입력하세요.")
                continue
            }

            println("수량을 입력하세요.")

            val quantity = readLine()?.toIntOrNull()
            if (quantity == null || quantity < 1) {
                println("수량은 1 이상이어야 합니다.")
                continue
            }

            val selectedProduct = selectedMenu.selectProduct(productNumber)

            total += selectedMenu.calculateTotal(quantity, selectedProduct)
            println("현재까지의 총 가격은 $total 원입니다.")

            while (true) {
                println("추가로 주문하시겠습니까? (y/n)")
                val additionalOrder = readLine()
                if (additionalOrder == "n" || additionalOrder == "N") {
                    println("결제 금액을 입력하세요.")

                    val payment = readLine()!!.toInt()
                    if (payment < total) {
                        println("금액이 부족합니다.")
                        continue
                    }

                    val change = payment - total
                    if (change > 0) {
                        println("거스름돈은 $change 원입니다.")
                    }
                    println("결제가 완료되었습니다.")
                    return
                } else if (additionalOrder == "y" || additionalOrder == "Y") {
                    break
                } else {
                    println("y 또는 n을 입력해주세요.")
                }
            }
        }
    }
}
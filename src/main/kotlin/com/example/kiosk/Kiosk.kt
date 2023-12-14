package com.example.kiosk

class Kiosk(val menus: List<Menu>) {
    fun displayMenus() {
        menus.forEachIndexed { index, menu ->
            println("${index + 1}. ${menu.menuName}")
        }
    }

    fun selectMenu(menuNumber: Int): Menu {
        return menus[menuNumber - 1]
    }
}


package com.example.calculator.execute

import com.example.calculator.abs.AbstractOperation

class DivideOperation : AbstractOperation() {
    override fun execute(a: Double, b: Double): Double {
        if (b != 0.0) return a / b
        else throw IllegalArgumentException("0으로 나눌 수 없습니다.")
    }
}



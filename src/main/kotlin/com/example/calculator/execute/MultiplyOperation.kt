package com.example.calculator.execute

import com.example.calculator.abs.AbstractOperation

class MultiplyOperation : AbstractOperation() {
    override fun execute(a: Double, b: Double): Double = a * b
}


package com.example.calculator.execute

class Calculator {
    fun calculate(a: Double, b: Double, operator: String): Double {
        val operation = when (operator) {
            "+" -> AddOperation()
            "-" -> SubtractOperation()
            "*" -> MultiplyOperation()
            "/" -> DivideOperation()
            else -> throw IllegalArgumentException("잘못된 연산자 입니다.")
        }
        return operation.execute(a, b)
    }
}
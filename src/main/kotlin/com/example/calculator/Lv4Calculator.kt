package com.example.calculator
import com.example.calculator.execute.Calculator


fun main() {
    val lv4Calculator = Calculator()

    println("첫 번째 숫자를 입력 하세요: ")
    val a = readln().toDouble()

    println("연산자를 입력 하세요(+, -, *, / 중 하나): ")
    val operator = readln()

    println("두 번째 숫자를 입력 하세요: ")
    val b = readln().toDouble()

    try {
        val result = lv4Calculator.calculate(a, b, operator)
        println("계산 결과: $result")
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }
}

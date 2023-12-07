
class AddOperation {
    fun add(a: Int, b: Int): Int = a + b
}

class SubtractOperation {
    fun subtract(a: Int, b: Int): Int = a - b
}

class MultiplyOperation {
    fun multiply(a: Int, b: Int): Int = a * b
}

class DivideOperation {
    fun divide(a: Int, b: Int): Int {
        if (b != 0) return a / b
        else throw IllegalArgumentException("0으로 나눌 수 없습니다.")
    }
}

class Lv3Calculator {
    fun calculate(a: Int, b: Int, operator: String): Int {
        return when (operator) {
            "+" -> AddOperation().add(a, b)
            "-" -> SubtractOperation().subtract(a, b)
            "*" -> MultiplyOperation().multiply(a, b)
            "/" -> DivideOperation().divide(a, b)
            else -> throw IllegalArgumentException("잘못된 연산자 입니다.")
        }
    }
}

fun main() {
    val lv3Calculator = Lv3Calculator()

    println("첫 번째 숫자를 입력 하세요: ")
    val a = readLine()!!.toInt()

    println("연산자를 입력 하세요(+, -, *, / 중 하나): ")
    val operator = readLine()!!.toString()

    println("두 번째 숫자를 입력 하세요: ")
    val b = readLine()!!.toInt()

    try {
        val result = lv3Calculator.calculate(a, b, operator)
        println("계산 결과: $result")
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }
}
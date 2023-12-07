
abstract class AbstractOperation {
    abstract fun execute(a: Double, b: Double): Double
}

class Lv4AddOperation : AbstractOperation() {
    override fun execute(a: Double, b: Double): Double = a + b
}

class Lv4SubtractOperation : AbstractOperation() {
    override fun execute(a: Double, b: Double): Double = a - b
}

class Lv4MultiplyOperation : AbstractOperation() {
    override fun execute(a: Double, b: Double): Double = a * b
}

class Lv4DivideOperation : AbstractOperation() {
    override fun execute(a: Double, b: Double): Double {
        if (b != 0.0) return a / b
        else throw IllegalArgumentException("0으로 나눌 수 없습니다.")
    }
}

class Lv4Calculator {
    fun calculate(a: Double, b: Double, operator: String): Double {
        val operation: AbstractOperation = when (operator) {
            "+" -> Lv4AddOperation()
            "-" -> Lv4SubtractOperation()
            "*" -> Lv4MultiplyOperation()
            "/" -> Lv4DivideOperation()
            else -> throw IllegalArgumentException("잘못된 연산자 입니다.")
        }
        return operation.execute(a, b)
    }
}

fun main() {
    val lv4Calculator = Lv4Calculator()

    println("첫 번째 숫자를 입력 하세요: ")
    val a = readLine()!!.toDouble()

    println("연산자를 입력 하세요(+, -, *, / 중 하나): ")
    val operator = readLine()!!.toString()

    println("두 번째 숫자를 입력 하세요: ")
    val b = readLine()!!.toDouble()

    try {
        val result = lv4Calculator.calculate(a, b, operator)
        println("계산 결과: $result")
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }
}
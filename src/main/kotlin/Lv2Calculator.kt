
class Lv2Calculator {
    var operator = "+"

    fun calculate(a: Int, b: Int): Int {
        return when (operator) {
            "+" -> a + b
            "-" -> a - b
            "*" -> a * b
            "/" -> {
                if (b != 0) a / b else throw IllegalArgumentException("0으로 나눌 수 없습니다.")
            }

            "%" -> {
                if (b != 0) a % b else throw IllegalArgumentException("0으로 나눌 수 없습니다.")
            }

            else -> throw IllegalArgumentException("잘못된 연산자 입니다.")
        }
    }
}

fun main() {

    val calculator = Lv2Calculator()

    println("첫 번째 숫자를 입력 하세요: ")
    val a = readLine()!!.toInt()

    println("연산자를 입력 하세요(+, -, *, /, % 중 하나): ")
    calculator.operator = readLine()!!.toString()

    println("두 번째 숫자를 입력 하세요: ")
    val b = readLine()!!.toInt()

    try {
        val result = calculator.calculate(a, b)
        println("계산 결과: $result")
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

}
import java.util.Scanner

class Calculator {
    var operator = '+'

    fun calculate(a: Int, b: Int): Int {
        return when (operator) {
            '+' -> a + b
            '-' -> a - b
            '*' -> a * b
            '/' -> {
                if (b != 0) a / b else throw IllegalArgumentException("0으로 나눌 수 없습니다.")
            }
            '%' ->{
                if (b != 0) a % b else throw IllegalArgumentException("0으로 나눌 수 없습니다.")
            }
            else -> throw IllegalArgumentException("잘못된 연산자입니다.")
        }
    }
}
fun main() {
    val scanner = Scanner(System.`in`)
    val calculator = Calculator()

    println("첫 번째 숫자를 입력하세요: ")
    val a = scanner.nextInt()

    println("연산자를 입력하세요(+, -, *, /, % 중 하나): ")
    calculator.operator = scanner.next()[0]

    println("두 번째 숫자를 입력하세요: ")
    val b = scanner.nextInt()



    try {
        val result = calculator.calculate(a, b)
        println("계산 결과: $result")
    } catch(e: IllegalArgumentException) {
        println(e.message)
    }
}
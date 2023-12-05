//연산자
fun main(args : Array<String>){
    var num1 = 30
    var num2 = 20
    // 덧셈 연산자
    var result1 = num1 + num2
    // 뺄셈 연산자
    var result2 = num1 - num2
    // 곱셈 연산자
    var result3 = num1 * num2
    // 나눗셈 연산자
    var result4 = num1 / num2
    // 나머지 연산자
    var result5 = num1 % num2
    println("덧셈 : ${result1}")
    println("뺄셈 : ${result2}")
    println("곱셈 : ${result3}")
    println("나눗셈 : ${result4}")
    println("나머지 : ${result5}")
    // 비교 연산자
    var mathScore = 95
    var englishScore = 30
    var isHighRank=mathScore > 90
    var isLowRank=englishScore<30
    println("내 수학점수는 고등급이다 참or거짓 : ${isHighRank}")
    println("내 영어수는 고등급이다 참or거짓 : ${isLowRank}")
}
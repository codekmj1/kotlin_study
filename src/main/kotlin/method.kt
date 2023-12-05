// 메소드
fun main(){
    var num1 = readLine()!!.toInt()
    var num2 = readLine()!!.toInt()
    sum(num1,num2)

    var mathScore = readLine()!!.toInt()
    var result = checkRank(mathScore)
    println("내 수학 등급은 ${result} 이다")
}
fun checkRank(mathScore : Int) : String{
    return when(mathScore) {
        in 90..100 -> return "A"
        in 80..89 -> return "B"
        in 70..79 -> return "C"
        else -> return "D"
    }

}

fun sum(num1 : Int, num2:Int){
    var result = num1 + num2
    println("num1 + num2 = ${result}")
}



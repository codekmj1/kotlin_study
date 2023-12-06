// 조건문
fun main(args: Array<String>){
    // if-else
    var koreaScore=readLine()!!.toInt()
    var mathScore = readLine()!!.toInt()
    var englishScore = readLine()!!.toInt()
    var average = (koreaScore+mathScore+englishScore) / 3
    if(average > 90){
        println("당신의 등급은 A 등급")
    }else if(average >80){
        println("당신의 등급은 B 등급")
    }else if(average >70){
        println("당신의 등급은 C 등급")
    }else{
        println("당신의 등급은 D 등급")
    }
    // when : 행운의 숫자
    var todayNumber = readLine()!!.toInt()
    when(todayNumber){
        1 -> {
            println("재물이 들어온다")
        }
        2 -> {
            println("검정색을 조심해라")
        }
        3 -> {
            println("지인과 관계 조심")
        }
        4 -> {
            println("물을 조심해라")
        }
    }
}
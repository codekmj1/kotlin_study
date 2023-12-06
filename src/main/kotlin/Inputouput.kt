// 입출력
fun main(args : Array<String>) {

    println("안녕하세요")
    val dataString = readLine()
    println("나는 ${dataString}를 입력했다")
    val dataNumber = readLine()!!.toInt()
    val sum = dataNumber+3
    println("입력은 ${dataString}인데 3을 더해서 ${sum}이다 ")
}
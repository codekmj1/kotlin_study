package com.example.week4

//fun main() {
//    Bird.fly("참새")
//}
//
//object Bird {
//    fun fly(name:String) {
//        println("${name}가 날아요~")
//    }
//}

fun main() {
    // trash와 같이 생성자에 매개변수 전달 가능
    var singletonObject1 = MySingletonClass.getInstance(trash = 1)
    singletonObject1.setNum(5)
    println("num값은: ${singletonObject1.getNum()}")

    // singletonObject2에서 num을 10으로 대입
    var singletonObject2 = MySingletonClass.getInstance(trash = 1)
    singletonObject2.setNum(10)

    // singletonObject1의 num이 10으로 출력됨
    // singletonObject1과 singletonObject2는 같은 객체를 공유하기 때문
    println("num값은: ${singletonObject1.getNum()}")

}

class MySingletonClass private constructor() {
    private var num:Int = 0

    companion object {
        @Volatile private var instance: MySingletonClass? = null
        private var trash = 0

        fun getInstance(trash: Int): MySingletonClass {
            this.trash = trash
            // 외부에서 요청왔을때 instance가 null인지 검증
            if(instance == null) {
                // synchronized로 외부 쓰레드의 접근을 막음
                // 쓰레드는 다음챕터에서 소개합니다!
                // 쓰레드간의 객체상태 혼돈을 막기위해 사용한다고 이해해주세요
                synchronized(this) {
                    instance = MySingletonClass()
                }
            }
            return instance!!

//            엘비스연산자와 뒷장에서배울 scope function을 이용하면
//            아래와같이 더욱 직관적인 코드 작성이 가능합니다
//            return instance ?: synchronized(this) {
//                // also는 호출한 객체를 it으로 넘김
//                // instance가 null이라면 새로 생성하고 아니면 무시함
//                instance ?: MySigletonClass().also {
//                    instance = it
//                }
//            }
        }
    }
    fun setNum(num: Int) {
        this.num = num
    }

    fun getNum(): Int{
        return this.num
    }
}
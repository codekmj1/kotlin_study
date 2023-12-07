class AccessTestChildClass: AccessTestClass() {

    fun protectedTest1() {
        println("e의 값은 ${e}")
    }
}
fun main() {
    var accessTestClass = AccessTestClass()
    var accessTestChildClass = AccessTestChildClass()

// . 하고 접근가능한 요소를 확인
    accessTestClass.internalTest()
//    accessTestChildClass.protectedTest1()
}
package com.example.week4

fun main() {
    var students = mutableListOf<Student>()
    var averages = mutableMapOf<String, Int>()

    for(idx in 0..2) {
        println("학생의 이름을 입력하세요")
        var name = readLine()!!

        println("국어 점수를 입력하세요")
        var kor = readLine()!!.toInt()

        println("수학 점수를 입력하세요")
        var math = readLine()!!.toInt()

        println("영어 점수를 입력하세요")
        var eng = readLine()!!.toInt()

        var average = (kor + math + eng) / 3
        var tempStudent = Student(name, kor, math, eng)

        students.add(tempStudent)
        averages[name] = average
    }

    for(student in students) {
        var average = averages[student.name]
        student.displayInfo()
        println("평균점수는 ${average} 입니다")
    }
}

class Student(name:String, kor:Int, math:Int, eng:Int) {
    var name:String
    var kor:Int
    var math:Int
    var eng:Int

    init {
        this.name = name
        this.kor = kor
        this.math = math
        this.eng = eng
    }

    fun displayInfo() {
        println("이름: $name")
        println("국어: $kor")
        println("수학: $math")
        println("영어: $eng")
    }
}


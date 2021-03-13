package company

data class Student(val glasses: Glasses?)
data class Seat(val student: Student?)
data class Glasses(val degreeOfMyopia: Double)

class Kot {
    var stu: Student? = Student(null)
    fun dealStu() {
        stu?.let { print(it.glasses) }
    }
}

fun main() {

}

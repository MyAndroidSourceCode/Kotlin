/**
 * Created by hiemseyha on 4/3/18.
 */


fun main(args: Array<String>) {

    var n1 = 10
    var n2 = 20

    var max = if(n1>n2) n1 else n2
    print("Max if expression: $max")

    var age = 30

    var isYoung = when(age) {
        30-> true
        else -> false
    }

    print("Is young: $isYoung")
}
/**
 * Created by hiemseyha on 5/9/18.
 */


fun sumTwo(v1:Int, v2:Int): Int {
    return v1 + v2
}


fun sumTwo(v1:Double, v2:Double): Double {
    return v1 + v2
}

fun sumTwo(v1:Int, v2:Int, v3:Int): Int {
    return v1 + v2 + v3
}


fun main(args:Array<String>) {

    var double = sumTwo(10.0, 20.0)
    println("Value of double sum : $double")

    var int = sumTwo(20,10)
    println("Value of double sum : $int")

    var threeInt = sumTwo(1,2,3)
    println("Value of overload function is $threeInt")


}



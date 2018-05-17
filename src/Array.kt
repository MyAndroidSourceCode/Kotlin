/**
 * Created by hiemseyha on 4/3/18.
 */


fun main(args: Array<String>) {

    var arrayInt = Array<Int>(5) { 0 }

    arrayInt[3] = 90

    println("Array of [3] is $arrayInt[3]")

    // By object
    for (value in arrayInt ){
        println("Value of  object $value")
    }

    // By index

    for(index in 0..arrayInt.count()) {
        println("Value of index " + arrayInt[index])
    }




}
/**
 * Created by hiemseyha on 3/19/18.
 */


fun main(arg:Array<String>) {
    print("Hello Kotlin \n")
    print("Welcome to Kotlin\n")

    var name:String = "Seyha"

    var desc:String?

    desc = "Hello i am string optional"


    print("i am here for concatenation " + desc + "\n")

    val hello = "Hello world"

    var readLine = readLine()
    var age:Int = readLine()!!.toInt()


    print("readline = " + readLine + "\n")
    print("Readline gate = " + age +  "\n")


    // Convert Data Type

    var n1: Int = 10
    var n2:Int?
    var nsStr:String = "12"
    n2 = nsStr.toInt()

    print("Convert Data Type \n")
    print("value converted: " + n2)

}
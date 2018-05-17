/**
 * Created by hiemseyha on 4/3/18.
 */




fun main(args: Array<String>) {

    var x  = 5

    when(x) {

        1, 2-> print("Value is 1 and 2")
//        2-> { print("Value is 2 ") }
        3-> print("Value is 3")
        in 10..30 -> {
            print("Value range from 10 to 30")
        }

        !in 30..100 -> {
            print("Value not range from 30 to 100")
        }

        else -> {
            print("Else of x value" + x)
        }
    }
}
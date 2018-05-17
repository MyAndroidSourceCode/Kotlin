/**
 * Created by hiemseyha on 4/3/18.
 */


fun main(args: Array<String>) {

    var arrayListString = ArrayList<String>()

    arrayListString.add("seyha")
    arrayListString.add("chanthem")
    arrayListString.add("soda")
    arrayListString.set(0, "Seyun")


    for(item in arrayListString) {
        println("Value of arraylist is $item")
    }

    if(arrayListString.contains("seyha")) {
        println("Value is found")
    } else {
        println("Value is not found")
    }

    println("Print value by index")

    for(index in 0..arrayListString.size - 1) {
        println("array list with index $index is " + arrayListString[index])
    }

}
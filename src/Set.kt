/**
 * Created by hiemseyha on 4/3/18.
 */



fun main(args: Array<String>) {


    var setElement = setOf(1,2,2,2,3,3,3,4,4,5,5)
    for(element in setElement) {
        println(element)
    }


    var setMutable = mutableSetOf(1,2,2,3,4,4,4,4,5)

    setMutable.add(10)
    setMutable.add(10)
    for(element in setMutable) {
        println(element)
    }

}
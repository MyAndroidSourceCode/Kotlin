/**
 * Created by hiemseyha on 4/3/18.
 */


fun main(args: Array<String>) {

    var map = hashMapOf(1 to "seyha", 2 to "chanthem")
    map.put(3, "soda")

    println(map.get(3))

    println("value like subscript " + map[1])

    var arr = arrayOf(1,29,20,122)
    println(arr[0])

    var list = listOf(11,22,33,12)
//    list[0] = 200 cannot change

    var listMutable = mutableListOf(11,23,33)
    listMutable[0] = 1110

}
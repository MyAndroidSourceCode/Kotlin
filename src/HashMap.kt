/**
 * Created by hiemseyha on 4/3/18.
 */


fun main(args: Array<String>) {

    var map = HashMap<Int, String>()
    map.put(0, "Seyha")
    map.put(1, "Chanthem")
    map.put(2, "Soda")

    println("Value of map by key " + map.get(0))

    for(key in map.keys) {
        println("Value of map by key " + map.get(key))
    }
}
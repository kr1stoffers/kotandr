package lab1

import kotlin.math.abs

fun main() {
    print("x: ")
    val x:Int = readln().toInt()
    print("a: ")
    val a:Int = readln().toInt()
    print("b: ")
    val b:Int = readln().toInt()

    for (i in a..b){
        var tmp = i
        var prod = 1
        while (tmp > 0){
            prod *= tmp % 10
            tmp /= 10
        }
        if (abs(prod) == x){
            println(i)
        }
    }
}
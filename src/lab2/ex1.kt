package lab2

import kotlin.random.Random

fun main() {
    print("Enter array size: ")
    val size = readln().toInt()
    val arr = IntArray(size){
        Random.nextInt(10)
    }

    println(arr.toList())

    for (i in arr.indices){
        if (arr[i] >= i){
            print("${arr[i]} ")
        }
    }
}
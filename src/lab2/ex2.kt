package lab2

import kotlin.random.Random

fun main() {
    print("Enter array size: ")
    val size = readln().toInt()
    val arr = IntArray(size){
        Random.nextInt(100)
    }
    println("Array:\n\t${ arr.toList() }")

    print("Enter k: ")
    val k = readln().toInt()
    val newArr = arr.filter { it % 10 == k }.toTypedArray()

    println("New array:\n\t${ newArr.toList() }")
}
package lab1

fun main() {
    val n:Int = readln().toInt()
    var sum = 0
    var tmp = n
    var count = 0
    while (tmp > 0){
        sum += tmp % 10
        tmp /= 10
    }
    println("Sum = $sum")
    for (i in 1..<n){
        var prod = 1
        var tmp = i
        while (tmp > 0){
            prod *= tmp % 10
            tmp /= 10
        }
        if (sum == prod){
            println(i)
        }else{
            count++
        }
    }
    if (count == (n - 1)){
        println("no 😔")
    }
}
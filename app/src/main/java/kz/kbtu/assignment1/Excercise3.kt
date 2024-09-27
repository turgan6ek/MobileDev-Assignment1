package kz.kbtu.assignment1

fun main() {
    println(highOrderMultiply(5, 10, multiply))
}

fun sum(num1: Int, num2: Int): Int{
    return num1 + num2;
}

val multiply: (Int, Int) -> Int = {a: Int, b: Int -> a * b}

fun highOrderMultiply(num1: Int, num2: Int, operation: (Int, Int) -> Int): Int {
    return operation(num1, num2)
}
fun main() {
    printVariables();

    println()

    println("is 5 a positive, negative or zero: " + isPositive(5))

    println()
    forIter()
    println()
    whileIter()
    println()
    println(sumOfAll(listOf(1, 2, 3, 4, 5, 6)))
    println()
    println()
}

fun printVariables() {
    var intType = 1;
    var doubleType = 1.0;
    var stringType = "1";
    var boolType = true;

    println(intType::class.toString() + " is int")
    println(doubleType::class.toString() + " is double")
    println(stringType::class.toString() + " is string")
    println(boolType::class.toString() + " is boolean")

}

fun isPositive(num: Int): String {
    if (num > 0)
        return "positive"
    else if (num < 0)
        return "negative"
    else
        return "zero"
}

fun forIter() {
    for (num in 1..10) {
        println(num)
    }
}

fun whileIter() {
    var n = 1;
    while (n <= 10) {

        println(n)
        n++
    }
}

fun sumOfAll(list: List<Int>): Int {
    var sum = 0;
    for(n in list) {
        sum += n;
    }
    return sum;
}
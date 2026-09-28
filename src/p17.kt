fun main() {
    val number = readln().toInt()

    println(factorial(number))
}

fun factorial(n: Int): Int {
    if (n == 0 || n == 1)
        return 1
    else
        return n * factorial(n - 1)
}
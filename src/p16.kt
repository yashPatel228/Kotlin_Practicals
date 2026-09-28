fun main(){
    val num1 = readln().toInt()
    val num2 = readln().toInt()
    println(add(num1, num2))
    println(sub(num1, num2))
    println(mul(num1, num2))
    println(mul(num1, num2))
}
fun add(num1: Int, num2: Int): Int {
    return num1 + num2
}
fun sub(num1: Int, num2: Int): Int {
    return num1 - num2
}
fun mul(num1: Int, num2: Int): Int {
    return num1 * num2
}
fun div(num1: Int, num2: Int): Int {
    return num1 / num2
}
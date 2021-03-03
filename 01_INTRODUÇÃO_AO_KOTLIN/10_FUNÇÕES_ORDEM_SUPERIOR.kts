val x = calculate(12,4,::sum)
val y = calculate(12,4){a, b -> a*b}

fun main() {
    val x,y,z:Int

    z = calculate(34, 90,::sum)
    println(z)

    y = calculate(34, 90){a, b -> a*b}
    println(y)

    x = calculate(34, 90){a, b -> println("Vou caulcular! $a + $b")
    println(x)
}

fun sum(number1:int, number2) = number1.plus(number2)

fun calculate(n1:Int, n2:Int, operation:(Int, Int)->Int):Int{
    val result = operation(n1, n2)
    return result
}
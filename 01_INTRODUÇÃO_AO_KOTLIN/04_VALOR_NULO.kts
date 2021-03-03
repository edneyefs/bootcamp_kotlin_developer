var month:Int? = null
//Atribui valor null corretamente a month

var day:Int = null
/*Erro de compilação
"Null can not be a value of a non-null type Int*/


/*Operadores aritméticos
SOMA - a + b            | COMANDO - a.plus(b)   | ATRIBUIÇÃO - a += b
SUBTRAÇÃO - a - b       | COMANDO - a.minus(b)  | ATRIBUIÇÃO - a -= b
MULTIPLICAÇÃO - a * b   | COMANDO - a.times(b)  | ATRIBUIÇÃO - a *= b
DIVISÃO - a / b         | COMANDO - a.div(b)    | ATRIBUIÇÃO - a /= b
RESTO - a % b           | COMANDO - a.mod(b)    | ATRIBUIÇÃO - a %= b
*/

fun main() {
    val count = 10
    var times = 9
    times += count
    println(times)
    println(count.plus(times))
}

fun mains() {
    var count = "Olá, "
    var times = "Mundo"
    println(count + time)
    //count += times
    //println(count)
}
/*Operadores comparativos
FUNÇÃO - E(&&)  | COMANDO - (expressão 1) and (expressão 2)
FUNÇÃO - Ou(||) | COMANDO - (expressão 1) or (expressão 2)
*/


/*Operadores In e Range
FUNÇÃO e EXPRESSÃO - contém(In)
FUNÇÃO e EXPRESSÃO - não contém(!In)
FUNÇÃO e EXPRESSÃO - range/faixa de valores(Int..Int)
*/
val numbers = listOf(3, 9, 0, 1, 2)
print(12 in numbers)
//false
print(12 in 0..20)
//true

fun main() {
    val bingo = listOf(8, 6, 34, 2, 13)
    val number = (1..34).random()

    println(number)
    println(number in bingo)
} 

const val MIN_AGE = 16
const val MAX_AGE = 68
fun main() {
    var age = (10..100).random()
    println(age)
    println(age in MIN_AGE..MAX_AGE)
    println(age >= MIN_AGE && age <= MAX_AGE)
}
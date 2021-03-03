/*Operadores comparativos
FUNÇÃO - maior/menor        | EXPRESSÃO - a>b ou a<b    | COMANDO - a.compareTo(b)>0 ou a.compareTo(b)<0
FUNÇÃO - maior/menor/igual  | EXPRESSÃO - a>=b ou a<=b  | COMANDO - a.compareTo(b)>=0 ou a.compareTo(b)<=0
FUNÇÃO - igual              | EXPRESSÃO - a==b          | COMANDO - a.equals(b)
FUNÇÃO - diferente          | EXPRESSÃO - a!=b          | COMANDO - !(a.equals(b))
*/

const val EQUAL = 0
const val LESS = -1
const val MORE = 1

fun main() {
    val d = 22
    val t = 90

    println(d<T)
    println(d!=T)
    println(d.compareTo(t) == MORE)
}
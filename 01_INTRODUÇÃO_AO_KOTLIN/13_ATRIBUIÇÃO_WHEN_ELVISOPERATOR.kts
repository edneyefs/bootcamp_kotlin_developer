//Atribuição
val MaxValue = if (a > b) a else if (a < b) b else b

    val minValue = if (a > b){
        println("b($b) é o menor valor")
        b
    }else if(a < b){
        println("a($a) é o menor valor")
        a
    }else{
        println("Os valores são iguais")
        b
    }


//When
when {
    a > b -> {}
    a != b && a > c -> {}
    b == 0 -> {}
    else -> {}
}

when(year) {
    -4000..475 -> //Antiguidade
    475..1452 -> //Medieval
    1453..1789 -> //Moderna
    currentYear -> //ano atual
}

fun main() {
    val grade = (0..10).random()
    println(grade.getStudentStatus())
}
fun Int.getStudentStatus():String{
    println("nota $this")
    //val x = when(this){
    return when(this){
        in 0..4 -> "Reprovado"
        in 5..7 -> "Mediano"
        in 8..8 -> "Bom"
        10 -> "Excelente"
        else -> "Indefinido"
        //return x
    }
}


//Elvis Operator
/*Nesse caso se o valor de a não for nulo, number receberá a.
Se o valor de a for nulo e b não for nulo, number receberá b.
Se a e b forem nulos, number receberá 0.
*/
val a:Int? = null
val c:Int? = 9
var number = a?: b?: 0

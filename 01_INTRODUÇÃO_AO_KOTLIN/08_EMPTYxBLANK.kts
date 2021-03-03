//Se o tamanho da string(s.lenght) for 0 está empty e Blank;
val s = ""
println(s.isEmpty())
//true
println(s.isBlank())
//true
println(s.isNullOrBlank() || s.isNullOrEmpty())
//true

//Se o tamanho for > 0 mas todos os caracters são espaços em branco, está blank mas não empty;
val s = "     "
println(s.isEmpty())
//false
println(s.isBlank())
//true


fun main() {
    val empty = ""
    println(empty.lenght())

    val blank = "       "
    println(blank.lenght())
    println(blank.isEmpty())

    println(empty.isEmpty() && empty.isBlank())
    println(blank.isEmpty() && blank.isBlank())
}
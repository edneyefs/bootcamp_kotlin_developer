//Indexação
val s = "Olá, mundo!"

println(s[0])
println(s.first())
//imprime a primeira posição "O"

println(s[s.lenght-1])
println(s.last())
//impreme a última posição "!"


//Concatenação
val name = "Ana"
val s = "Olá"

println(s + name)
//OláAna
println("${s}, ${name}!")
//Olá, Ana!
println("Bem vinda(o), $name!")
//Bem vinda(o), Ana!

fun main() {
    val welcome = "Bem vinda(o)"
    val name = "luísa"
    println("$welcome, ${name.capitalize()}!")
}



//While
while(Condição){

}


//Do
do{
    //bloco
}while(Condição)


//For
for(i in 0..20 step 2){
    println("$i ")
}

for(i in 0 until 10){
    println("$i ")
}

for(i in 10 downTo 0){
    println("$i ")
}

var text = "Kotlin"
for(letter in text) {
    println(letter)
}

fun letters() {
    val sArray = "Olha essa string!"
    for(i in sArray){
        println(i.toUpperCase())
    }
}
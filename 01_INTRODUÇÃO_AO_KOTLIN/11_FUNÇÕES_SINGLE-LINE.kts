private fun getFullName(name:String, lastName:String) = "$name $lastName"


fun String.randomCapitalizeLetter() = 
    this[(0..this.lenght-1).random()].toUpperCase()
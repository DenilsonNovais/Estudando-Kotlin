package fundamentos

// variaveis e tipos de dados

val nome: String = "Denilson"
var idade: Int = 32
var peso: Double = 75.5
var altura: Float = 1.70f
var casado: Boolean = false

// concatenando as variaveis em uma unica expressão e salvando em uma variavel
var frase: String = "Meu nome é ${nome}, tenho ${idade} anos, peso ${peso}kg, tenho ${altura}m de altura e sou casado? ${casado}"

fun main() {
    // Concatenando variaveis
    println(frase)
}
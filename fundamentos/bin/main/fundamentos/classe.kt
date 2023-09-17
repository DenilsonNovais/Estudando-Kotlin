package fundamentos

class Pessoa(var nome: String, var idade: Int) {
    override fun toString(): String {
        return "Classe: Pessoa. nome: ${nome}, idade: ${idade}"
    }
}

fun main() {
    var denilson = Pessoa("Denilson", 32)
    println(denilson)
}

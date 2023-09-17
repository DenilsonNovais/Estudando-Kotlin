package fundamentos

class Carro(cor: String, ano: Int, modelo: String) {
    var cor: String
    var ano: Int
    var modelo: String

    init {
        this.cor = cor
        this.ano = ano
        this.modelo = modelo
    }

    override fun toString(): String {
        return "Classe: Carro. cor: ${cor}, ano: ${ano}, modelo: ${modelo}"
    }
}


fun main() {
    var carro = Carro("Preto", 2021, "Fusca")
    println(carro)
}
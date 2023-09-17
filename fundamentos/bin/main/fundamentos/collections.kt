package fundamentos

fun main() {
    var lista = mutableListOf(1,2,3,4,5)

//    for (numero in lista) {
//        println(numero)
//    }

    lista.add((8))
    println(lista[0])
    println(lista.get(0))
    println(lista.indexOf(2))
    println(lista.size)
}
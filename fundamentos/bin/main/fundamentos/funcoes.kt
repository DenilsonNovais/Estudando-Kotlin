package fundamentos

// funcoes
fun soma(a: Int, b: Int): Int {
    return a + b
}

fun subtracao(a: Int, b: Int): Int {
    return a - b
}

fun multiplicacao(a: Int, b: Int): Int {
    return a * b
}

fun divisao(a: Int, b: Int): Int {
    return a / b
}

fun resto(a: Int, b: Int): Int {
    return a % b
}

fun potencia(a: Int, b: Int): Int {
    return a * b
}

fun raizQuadrada(a: Int): Int {
    return a * a
}
// funcoes com parametros default
fun soma1(a: Int, b: Int = 1): Int {
    return a + b
}
//extensoes de funcoes
fun Int.potencia1(a: Int): Int {
    return a * a
}

// outros tipos de funcoes
fun soma2(a: Int, b: Int) = a + b

fun main() {
    // chamando funcoes
    println(soma(10, 10))
    println("Subtracao: ${soma2(10, 10)}")

    // chamando funcoes com parametros default
    println("Soma com parametro default: ${soma1(10)}")

    // chamando funcoes com extensoes
    println("Potencia: ${10.potencia1(10)}")
}
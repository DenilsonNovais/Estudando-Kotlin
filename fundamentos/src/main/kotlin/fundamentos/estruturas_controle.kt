package fundamentos

// if, else if, else
fun verificarIdade(idade: Int) {
    if (idade >= 18) {
        println("Você é maior de idade.")
    } else {
        println("Você é menor de idade.")
    }
}

fun validaNota (nota: Double) {
    if (nota >= 7.0) {
        println("Aprovado")
    } else if (nota >= 5.0 && nota <= 6.99) {
        println("Recuperacao")
    } else {
        println("Reprovado")
    }
}

// when
fun validaNota2 (nota: Double) {
    when (nota) {
        10.0, 9.0 -> println("Fantastico")
        8.0, 7.0 -> println("Parabens")
        6.0, 5.0 -> println("Recuperacao")
        4.0, 3.0 -> println("Recuperacao + Trabalho")
        2.0, 1.0, 0.0 -> println("Reprovado")
        else -> println("Nota invalida")
    }
}

// for
fun tabuada(numero: Int) {
    for (i in 1..10) {
        println("$numero x $i = ${numero * i}")
    }
}

// while
fun tabuada2(numero: Int) {
    var i = 1
    while (i <= 10) {
        println("$numero x $i = ${numero * i}")
        i++
    }
}

// do while
fun tabuada3(numero: Int) {
    var i = 1
    do {
        println("$numero x $i = ${numero * i}")
        i++
    } while (i <= 10)
}

// foreach
fun tabuada4(numero: Int) {
    for (i in 1..10) {
        println("$numero x $i = ${numero * i}")
    }
}

// break
fun tabuada5(numero: Int) {
    for (i in 1..10) {
        if (i == 5) {
            break
        }
        println("$numero x $i = ${numero * i}")
    }
}

// continue
fun tabuada6(numero: Int) {
    for (i in 1..10) {
        if (i == 5) {
            continue
        }
        println("$numero x $i = ${numero * i}")
    }
}

// return
fun tabuada7(numero: Int) {
    for (i in 1..10) {
        if (i == 5) {
            return
        }
        println("$numero x $i = ${numero * i}")
    }
}


fun main() {
    // chamando estruturas de controle
    verificarIdade(32)
    validaNota(7.0)
    validaNota2(6.0)
//    tabuada(5)
//    tabuada2(5)
//    tabuada3(5)
//    tabuada4(5)
//    tabuada5(5)
//    tabuada6(5)
//    tabuada7(5)
}

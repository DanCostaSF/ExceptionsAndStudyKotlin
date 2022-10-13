package br.com.alura.bytebank.teste

fun funcaoLambda() {
    val minhaFuncaoLambda = { a: Int, b: Int ->
        a + b
    }

    println(minhaFuncaoLambda(10, 32))

    val calculaBonificacao: (salario: Double) -> Double = lambda@{ salario ->
        if (salario > 1000.0) {
            return@lambda salario + 50
        }
        return@lambda salario + 100.0
    }

    println(calculaBonificacao(1000.0))
}

fun funcaoAnonima() {
    val minhaFuncaoAnonima = fun(a: Int, b: Int): Int {
        return a + b
    }

    println(minhaFuncaoAnonima(23, 44))

    val calculaBonificacaoAnonima: (salario: Double) -> Double = fun(salario): Double {
        if (salario > 1000.0) {
            return salario + 50
        }
        return salario + 100.0
    }

    println(calculaBonificacaoAnonima(1000.0))
}

fun testaTipoFuncaoClasse() {
    val minhaFuncaoClasse: (Int, Int) -> Int = Soma()
    println(minhaFuncaoClasse(10, 10))
}

fun testaTipoFuncaoReferencia() {
    val minhaFuncao: (Int, Int) -> Int = ::soma
    println(minhaFuncao(5, 10))
}

fun soma(a: Int, b: Int) : Int {
    return a + b
}

class Soma : (Int, Int) -> Int {
    override fun invoke(a: Int, b: Int): Int = a + b
}
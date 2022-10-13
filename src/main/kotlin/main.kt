package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco

fun main() {
    val a = mutableListOf(
        " ",
        "teste", "alo boa noite"
    ).map { teste ->
        teste.replace("\\s+".toRegex(), " ")
    }.filter {
        it.isNotEmpty() && it != " "
    }.joinToString(separator = ", ") {
        it
    }
    println(a)
}

private fun testaWith() {
    with(Endereco()) {
        logradouro = "Rua Travessa Amanda"
        numero = 72
        bairro = "Paul"
        cidade = "Vila Velha"
        estado = "ES"
        cep = "29115-122"
        complemento = "Casa 3 andares rosa"
        completo()
    }.let(::println)
}




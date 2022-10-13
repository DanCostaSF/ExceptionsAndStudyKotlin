package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

fun testeNullable() {
    var enderecoNulo: Endereco? = Endereco("Rua vergueiro", complemento = "predio")

    enderecoNulo?.let { endereco ->
        println(endereco.logradouro.length)
        val tamanhoComplemento: Int =
            endereco.complemento.length ?: throw IllegalStateException("Complemento não pode ser vazio")
        println(tamanhoComplemento)
    }

    teste("2")
    teste(1)
}

fun teste(valor: Any) {
    val numero: Int? = valor as? Int
    println(numero)
}
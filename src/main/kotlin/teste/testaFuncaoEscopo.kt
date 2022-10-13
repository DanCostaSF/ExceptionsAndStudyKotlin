package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

fun testaFuncaoEscopo() {
    val endereco = Endereco()
        .also { println("Criando endereço") }
        .apply {
            logradouro = "Rua da loca"
            numero = 385
        }
//    val enderecoEmMaiusculo = "${endereco.logradouro}, ${endereco.numero}".uppercase()
//    println(enderecoEmMaiusculo)

    //let é quando você quer trabalhar no resultado de uma ou mais funções
    Endereco(logradouro = "Rua amandinha", numero = 3185).let { endereco1 ->
        "${endereco1.logradouro}, ${endereco1.numero} ".uppercase()
    }.let(::println)

    Endereco(logradouro = "Rua amandinha", numero = 3185).run {
        "$logradouro, $numero".uppercase()
    }.let(::println)

    with(endereco) {
        "$logradouro, $numero".uppercase()
    }.let { enderecoEmMaiusculo: String ->
        println(enderecoEmMaiusculo)
    }

    listOf(
        Endereco(complemento = "Casa"),
        Endereco(),
        Endereco(complemento = "Apartamento")
    ).filter(predicate = { endereco -> endereco.complemento.isNotEmpty() })
        .let(block = (::println))
}

package br.com.alura.bytebank.teste

import java.lang.NumberFormatException

fun testaExpressao() {
    println("inicio main")
    val entrada = "1.0"

    val valor = try {
        entrada.toDouble()
    } catch (e: NumberFormatException) {
        println("Problema na conversão")
        e.printStackTrace()
        null
    }


    val valorComTaxa: Double? = if (valor != null) {
        valor + 0.1
    } else {
        null
    }

    if (valorComTaxa != null) {
        println("valor recebido: $valorComTaxa")
    } else {
        println("valor inválido")
    }
}
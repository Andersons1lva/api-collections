package one.digitalinnovation.collection

fun main() {
    val joao = Funcionario(nome = "Joao", salario = 4000.0, tipoContratacao = "CLT")
    val pedro = Funcionario(nome = "Pedro", salario = 9000.0, tipoContratacao = "PJ")
    val maria = Funcionario(nome = "Maria", salario = 6000.0, tipoContratacao = "CLT")

    println("======= LIST =======")

    val funcionario = mutableListOf(joao,maria) /*(mutableListOf) e uma lista mutavel, mesmo depois de criada você consegue alterar*/
    funcionario.forEach { println(it) }

    println("========================")
    funcionario.add(pedro) /*"add" serve para adicionar*/
    funcionario.forEach { println(it) }

    println("========================")
    funcionario.remove(joao) /*"remove" serve para remover*/
    funcionario.forEach { println(it) }

    println("======= SET =======")

    val funcionariosSet = mutableSetOf(joao)
    funcionariosSet.forEach { println(it) }
}
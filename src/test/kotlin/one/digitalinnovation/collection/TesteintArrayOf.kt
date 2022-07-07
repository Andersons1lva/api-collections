package one.digitalinnovation.collection

fun main() {
    val aluno = intArrayOf(2,3,4,1,10,7)

    aluno.forEach {
        println(it)
    }

    println("===================")

    aluno.sort() /* " aluno.sort" e para ordenação do array"*/
    aluno.forEach {
        println(it)
    }
}
package one.digitalinnovation.collection

fun main() {
    val aluno = IntArray(5)
    aluno[0] = 1
    aluno[1] = 7
    aluno[2] = 6
    aluno[3] = 3
    aluno[4] = 2

    /* Quando Trabalhos com Array, precisamos de um for como mostrado abaixo
    * it e uma variavel padrão, mas podemos criar uma e subsitituir no local */

    for (it in aluno) {
        println(it)
    }

    println("-----------------------------")

    aluno.forEach { valor ->
        println(valor)
    }

    println("-----------------------------")

    for (index in aluno.indices){
        println(aluno[index])
    }
}
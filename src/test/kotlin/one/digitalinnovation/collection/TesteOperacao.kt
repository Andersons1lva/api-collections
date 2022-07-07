package one.digitalinnovation.collection

fun main() {
    val salarios = doubleArrayOf(2000.0, 3000.0, 10000.0)

    for (salario in salarios){
        println(salario)
    }

    println("=================================")

    println("Maior Salario: ${salarios.maxOrNull()}")
    println("Menor Salario: ${salarios.minOrNull()}")
    println("Media salarial: ${salarios.average()}")/*"average" serve para ver media*/

    val salariosMaiorQue2500 = salarios.filter { it > 2500.0 } /*Filter necessita de um parametro para funcionar*/
    println("=================================")
    salariosMaiorQue2500.forEach{ println(it) }

    println("=================================")

    println(salarios.count{it in 2000.0..5000.0}) /*count ele serve para contar dentro do Array, dai você determina o inicio e o final para contagem */

    println("=================================")

    println(salarios.find{it == 3000.0}) /*find e usado quando você que imprimir um valor especifico*/

    println("=================================")

    println(salarios.any{it == 10000.0})/*any serve para para buscar elemento e verificar se e falso ou verdadeiro dentro do array*/

}
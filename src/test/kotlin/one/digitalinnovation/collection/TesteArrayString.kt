package one.digitalinnovation.collection

fun main() {
    val nomes = Array(3){""}
    nomes [0] = "ALINE"
    nomes [1] = "Hanry"
    nomes [2] = "Marines"

    nomes.forEach {
        println(it)
    }
    nomes.sort()

    /*Outra forma de trabalha com array*/

    val nomes2 = arrayOf("maria", "ZAZA", "Pedrinho")
    nomes2.forEach { println(it) }
    nomes2.sort()
}
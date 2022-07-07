package one.digitalinnovation.collection

fun main() {
    val joao = Funcionario(nome = "Joao", salario = 4000.0, tipoContratacao = "CLT")
    val pedro = Funcionario(nome = "Pedro", salario = 9000.0, tipoContratacao = "PJ")
    val maria = Funcionario(nome = "Maria", salario = 6000.0, tipoContratacao = "CLT")

    val funcionarios = listOf(joao, pedro, maria)

    funcionarios.forEach{ println(it) }

    println("======================")
    println(funcionarios.find { it.nome == "Maria" }) /*find sendo usado para trazer apenas Maria*/
    println("======================")
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }

    println("======================")
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach { println(it) }
}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
){
    override fun toString(): String = """
        Nome: $nome
        Salario: $salario
        
    """.trimIndent()

}
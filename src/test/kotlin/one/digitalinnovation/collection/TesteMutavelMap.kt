package one.digitalinnovation.collection

fun main(){
    val joao = Funcionario(nome = "Joao", salario = 4000.0, tipoContratacao = "CLT")
    val pedro = Funcionario(nome = "Pedro", salario = 9000.0, tipoContratacao = "PJ")
    val maria = Funcionario(nome = "Maria", salario = 6000.0, tipoContratacao = "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    println(repositorio.findById(joao.nome))

    println("===================")
    repositorio.findAll().forEach{ println(it) }

    println("===================")
    (repositorio.remove(maria.nome))
    repositorio.findAll().forEach{ println(it) }
}
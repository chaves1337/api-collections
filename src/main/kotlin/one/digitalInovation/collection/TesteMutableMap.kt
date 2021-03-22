package one.digitalInovation.collection

fun main(){
    val joao = Funcionarios("João", 2000.0, "CLT")
    val pedro = Funcionarios("Pedro", 1500.0, "CLT")
    val maria = Funcionarios("Maria", 4000.0, "PJ")

    val repositorio = Repositorio<Funcionarios>()

    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    println(repositorio.findById(id = maria.nome))

    println("--------------------------------")

    repositorio.findAll().forEach{ println(it)}

    println("--------------------------------")

    repositorio.remove(maria.nome)

    repositorio.findAll().forEach{ println(it)}
}
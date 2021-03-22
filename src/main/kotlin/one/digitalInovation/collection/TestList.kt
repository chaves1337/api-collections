package one.digitalInovation.collection

fun main(){

    val joao = Funcionarios("João", 2000.0, "CLT")
    val pedro = Funcionarios("Pedro", 1500.0, "CLT")
    val maria = Funcionarios("Maria", 4000.0, "PJ")

    val funcionarios = listOf(joao, pedro, maria)

    funcionarios.forEach{
        println(it)
}
    println("-----------------------------")

    println(funcionarios.find { it.nome == "Maria" })

    println("-----------------------------")

    funcionarios
        .groupBy { it.tipo }
        .forEach{ println(it)}


}

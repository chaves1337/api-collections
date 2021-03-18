package one.digitalInovation.collection

fun main(){

    val joao = Funcionario("João", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "CLT")
    val maria = Funcionario("Maria", 4000.0, "PJ")

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
data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipo: String
) {
    override fun toString(): String =
        """
            Nome:       $nome
            Salario:    $salario
        
        """.trimIndent()
}
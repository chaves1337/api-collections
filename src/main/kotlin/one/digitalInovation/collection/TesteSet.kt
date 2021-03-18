package one.digitalInovation.collection

fun main(){

    val joao = Funcionario("João", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "CLT")
    val maria = Funcionario("Maria", 4000.0, "PJ")

    val funcionarios = setOf(joao, pedro)
    val funcionarios2 = setOf(maria)

    val result = funcionarios.union(funcionarios2)

    result.forEach { println(it) }

    println("----------------------------")
    val funcionarios3 = setOf(joao, pedro, maria)
    val resultSub = funcionarios3.subtract(funcionarios2)
    resultSub.forEach { println(it) }

    println("----------------------------")
    val funcionarios4 = funcionarios3.intersect(funcionarios2)
    funcionarios4.forEach { println(it) }


}
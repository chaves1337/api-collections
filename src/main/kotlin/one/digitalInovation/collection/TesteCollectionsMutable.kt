package one.digitalInovation.collection

fun main(){

    val joao = Funcionarios("João", 2000.0, "CLT")
    val pedro = Funcionarios("Pedro", 1500.0, "CLT")
    val maria = Funcionarios("Maria", 4000.0, "PJ")

    val funcionarios = mutableListOf(joao, pedro)

    funcionarios.forEach { println(it) }

    println("--------------------------------------")

    funcionarios.add(maria)
    funcionarios.forEach(::println)

    println("--------------------------------------")

    funcionarios.remove(joao)
    funcionarios.forEach(::println)

    println("--------------------------------------")

    val funcionariosSet = mutableSetOf(joao)

    funcionariosSet.forEach { println(it)}

    funcionariosSet.add(pedro)
    funcionariosSet.add(maria)

    println("--------------------------------------")


    funcionariosSet.forEach { println(it) }

}
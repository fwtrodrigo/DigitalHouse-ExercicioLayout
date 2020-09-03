package br.digital.com.aulakotlinsemobj

fun main(){
    println("Hello World!")
    println(meuNome("Matheus ", "Barbosa Silva"))

    var lista = arrayListOf<String>()
    lista.add("primeiroItem")
    println(lista.get(0))

    println("Exercício 1: "+ exercicio1(5, 7, 1))
    println("Exercício 2: "+ exercicio2("Matheus", "faffds"))
    println("Exercício 3: "+ exercicio3(3))
    exercicio4()
    println()
    println(exercicio5(9, 8, 7, 2))
    exercicio6()
}

//Exercicio 1
fun exercicio1(num1: Int, num2: Int, num3: Int): Int{
    var maior = num1

    if (num1 <= num2){
        maior = num2
    }
    if(maior <= num3){
        maior = num3
    }

    return maior;
}

//Exercicio 2
fun exercicio2(str1: String, str2: String): Boolean{
    return (str1 != str2)
}

//Exercicio 3
fun exercicio3(num: Int): Boolean{
    return (num % 2 == 0)
}

//Exercicio 4
fun exercicio4(){
    for (i in 1..200 step 2)
        print("$i, ")
}

//Exercicio 5
fun exercicio5(numA: Int, numB: Int, numC: Int, numD: Int): Boolean{
    return ((numA > numC && numA > numD) || (numB > numC && numB > numD))
}

//Exercicio 6
fun exercicio6(){
    for (i in 1..100)
        print("$i, ")
}

fun meuNome(nome: String, sobrenome: String): String{
    return nome + sobrenome
}
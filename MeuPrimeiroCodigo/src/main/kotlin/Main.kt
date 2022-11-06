fun Somar(){
    println("Quantos numeros deseja somar?")
    val qtdNumeros = readLine()!!.toInt();
    var i = 1
    var soma = 0

    while ( i <= qtdNumeros)
    {
        println("Qual valor deseja somar?")
        soma += readLine()!!.toInt(); //atribuino a soma do valo digitado com o que já existe na variavel soma
        i++;
    }
    println("A soma total eh: "+soma)
}
fun Subtrair(){
    println("Quantos numeros deseja subtrair?")
    val qtdNumeros = readLine()!!.toInt();
    var i = 1
    var subtrair = 0

    while ( i <= qtdNumeros)
    {
        println("Qual valor deseja subtrair?")
        if(i == 1)
        {
            subtrair = readLine()!!.toInt();
        }
        else
        {
            subtrair -= readLine()!!.toInt(); //subtraindo o valor digitado com o que já existe na variavel subtrair
        }
        i++;
    }
    println("A subtracao total eh: "+subtrair)
}
fun Multiplicar(){
    println("Quantos numeros deseja multiplicar?")
    val qtdNumeros = readLine()!!.toInt();
    var i = 1
    var multi = 0

    while ( i <= qtdNumeros)
    {
        println("Qual valor deseja multiplicar?")
        if(i == 1)
        {
            multi = readLine()!!.toInt();
        }
        else
        {
            multi *= readLine()!!.toInt();
        }
        i++;
    }
    println("A multiplicacao total eh: "+multi)
}
fun Dividir(){
    println("Quantos numeros deseja dividir?")
    val qtdNumeros = readLine()!!.toInt();
    var i = 1
    var divisao = 0

    while ( i <= qtdNumeros)
    {
        println("Qual valor deseja dividir?")
        if(i == 1)
        {
            divisao = readLine()!!.toInt();
        }
        else
        {
            divisao /= readLine()!!.toInt();
        }

        i++;
    }
    println("A divisao total eh: "+divisao)
}
fun Menu(){
    var opcao = 5
    while(opcao != 0)
    {
        println("Iniciando uma calculadora com Kotlin!")
        println("Qual operação deseja realiza?")
        println("Digite 1 para somar")
        println("Digite 2 para subtrair")
        println("Digite 3 para multiplicar")
        println("Digite 4 para dividir")
        println("Digite 0 para sair")
        opcao = readLine()!!.toInt();
        val result = when(opcao)
        {
            0 -> opcao = 0
            1 -> Somar()
            2 -> Subtrair()
            3 -> Multiplicar()
            4 -> Dividir()
            else -> "Opcao invalida"
        }
    }
}
fun main() {
    Menu() // chamada do metodo Menu que irá iniciar a calculadora
}
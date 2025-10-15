fun mostraText(nome: String) {
    println("Seja bem-vindo $nome")
    val abc = "qualquer" // <- Aqui val abc pertence a função
}

fun calcMedia(n1: Int, n2: Int):Int {//Aqui a função é criada com dois parametros e retorno Int.
    println(abc)// <- Aqui a variável é chamada, mas da erro pois está fora do contexto da função.
    val media = (n1 + n2) / 2 //Variável media é criada
    return media
}


fun main() {
  mostraText("Bot seu resultado é: ")//Aqui a função está retornando a função e
    println(calcMedia(10, 20))
}


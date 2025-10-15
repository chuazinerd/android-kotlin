fun mostraText(nome: String) {
    println("Seja bem-vindo $nome")
}

fun calcMedia(n1: Int, n2: Int):Int {
    val media = (n1 + n2) / 2
    return media
}


fun main() {
  mostraText("Bot seu resultado é: ")
  println(calcMedia(10, 20))
}


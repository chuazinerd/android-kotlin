fun main() {
    val texto = "Kotlin -> Android"

    println(texto[0])//Mostra a primeira posição do texto
    println(texto.length)//Apresenta o total de caracteres
    println(texto.startsWith("z"))//Verifica se texto começa c/ "z" e retorna verdadeiro ou falso
    println(texto.endsWith("A"))//Tambem verifica se texto termina c/ "z" e retorna verdadeiro ou falso
    println(texto.substring(16))//Mostra apartir do caractere n 16
    println(texto.substring(4, 12))//Retorna do caractere 5 até o caractere 11
    println(texto.replace("o" , "0"))//Procura o caractere escolhido e o substitui

    println(texto.uppercase())//Deixa o texto em caixa alta
    println(texto.lowercase())//Deixa o texto em caixa baixa
    println(texto.contains("Android"))//Retorna se existe ou não "Android"
    texto.isEmpty()
    println("  asdfasdf asdfasdf asdfasdf ".trim())//Remove os espaços dos cantos
}

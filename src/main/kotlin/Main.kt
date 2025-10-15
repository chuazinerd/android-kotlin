fun main() {
    val inter = "Inter"
    val frase1 = "Kotlin"
    val frase2 = "é"
    val frase3 = "top demais"
    val polando = "polando"
    //Para mostrar o retorno dos valores das variáveis
    //"println(frase1 + frase2 + frase3)" deve ser usar o operador de concatenação "+",
    //no entanto é possivel usar o operador de interpolação "$".
    println("$inter =====$frase1 $frase2 $frase3===== $polando")
    println("Mostra valor máximo: ${Double.MAX_VALUE}")
    //"$" é para variáveis, e ${} é para o encapsulamento de tudo que é mais complexo que uma variável.
}
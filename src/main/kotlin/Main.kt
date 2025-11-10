fun main() {
    val nome = "Jose";
    println("Olá, $nome");
    println("Olá, %s".format(nome));//Útil quando  é preciso de uma formatação muito específica
    // (como número de casas decimais,
    // %s - String - cadeia de caracteres
    // %d - Int - inteiro
    // %f - Ponto flutuante
    // %c - char - caractere
    // %b - boleano - verdadeiro ou falso
    val value= 5;
    val salario = 15898.34
    println("Valor: %05d - salário: %.3f".format(value, salario));//%d formata value para inteiro
    // enquanto %.3f formata para tipo flutuante com 3 casas decimais
}
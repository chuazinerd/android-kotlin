fun main() {
    // str: é o mesmo que: str será do tipo String
    var str: String = "abc"//É possivel usar var, mas não aconselhavel porque no fututo ela pode ser alterada
    //o que causará erro
    println(str)
    str  = "jde"//Valor alterado dentro de str

    //Forma mais segura:
    val texto: String = "abc"//Com val o valor armazenado é definitivo
    val = "jdk"// <- Aqui a alteração não foi aceita, o que era esperado
}
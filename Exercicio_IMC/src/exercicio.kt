fun main(){
    var pessoa1 : Pessoas = Pessoas()
    var pessoa2 : Pessoas = Pessoas()

    println("Insira o nome da pessoa 1: ")
    var entrada: String = readln()
    pessoa1.setNome( entrada.toString())

    println("Insira o nome da pessoa 2: ")
    entrada = readln()
    pessoa2.setNome( entrada.toString())

    println("Insira a idade da pessoa 1: ")
    entrada = readln()
    pessoa1.setIdade( entrada.toInt())

    println("Insira a idade da pessoa 2: ")
    entrada = readln()
    pessoa2.setIdade( entrada.toInt())

    println("Insira o peso da pessoa 1: ")
    entrada = readln()
    pessoa1.setPeso( entrada.toDouble())

    println("Insira o peso da pessoa 2: ")
    entrada = readln()
    pessoa2.setPeso( entrada.toDouble())

    println("Insira a altura da pessoa 1: ")
    entrada = readln()
    pessoa1.setAltura( entrada.toDouble())

    println("Insira a altura da pessoa 2: ")
    entrada = readln()
    pessoa2.setAltura( entrada.toDouble())

    println("\nPessoa 1:")
    pessoa1.exibirInfo()

    println("\nPessoa 2:")
    pessoa2.exibirInfo()
}

class Pessoas{
    var nome: String = ""
    var idade: Int = 0
    var peso:Double = 0.0
    var altura: Double = 0.0
    var imc: Double = 0.0

    fun setNome( n : String){
        if(n != null){
            nome = n;
        }
    }
    fun getNome(): String{
        return nome
    }

    fun setIdade( i : Int){
        if(i>0){
            idade = i;
        }
    }
    fun getIdade(): Int{
        return idade
    }

    fun setPeso( peso : Double){
        if(peso>0.0){
            return
        }
    }
    fun getPeso(): Double{
        return peso
    }

    fun setAltura( a : Double){
        if(a>0.0){
            altura = a;
        }
    }
    fun getAltura(): Double{
        return altura
    }

    fun calcularIMC(): Double{
        return peso/(altura*altura)
    }

    fun classificarIMC(): String{
        imc = calcularIMC()

        return when {
            imc < 18.5 -> "Abaixo do Peso Ideal"
            imc <= 24.9 -> "Peso Normal"
            imc <= 29.9 -> "Acima do Peso"
            imc <= 34.9 -> "Obesidade Grau 1"
            imc <= 39.9 -> "Obesidade Grau 2"
            else -> "Obesidade Grau 3"
        }
    }

    fun exibirInfo(){
        println("Nome: $nome")
        println("Idade: $idade anos")
        println("Peso: %.2f kg".format(peso))
        println("Altura: %.2f m".format(altura))
        println("IMC: %.2f (${classificarIMC()})".format(calcularIMC()))
    }
}

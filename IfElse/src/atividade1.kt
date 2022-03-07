import kotlin.random.Random
fun main(args: Array<String>) {
    atividade1()

  class atividade1():Unit{
   println("digite o primeiro numero:")
   val num1 = readLine()!!.toFloat()
   println("digite o segundo numero:")
   val num2 = readLine()!!.toFloat()

   if(num1 > num2){
       println("O primeiro numero($num1) é maior que o segundo numero($num2) ")
   }else{
       println("O primeiro numero($num1) NAO é maior que o segundo numero($num2) ")
   }
}
}

fun atividade2()

fun atividade2()Unit{
    println("digite um numero:")
    val num = readLine()!!.toFloat()

    if(num > 0){
        println("O numero $num é positivo!!!")
    }else{
        println("O numero $num é negativo!!!")
    }

}


fun atividade3()Unit{
val letra = readLine()!!.toFloat()

if(
letra.equals(other."a", ignoreCase:True)  ||
letra.equals(other."e", ignoreCase:True)  ||
letra.equals(other."i", ignoreCase:True)  ||
letra.equals(other."o", ignoreCase:True)  ||
letra.equals(other."u", ignoreCase:True)  ||
){
    println("A letra $letra é uma vogal!!!")
}else
    println("A letra $letra é uma consoante!!!")


)
}

fun atividade4()Unit{
    val adivinha {
        fun jogar(panpite:Int):String{
            val numeroSorteado = Random.nextInt(0, 10)

            return if(panpite == numeroSorteado) "Voce ganhou!!!" else "Voce erroooou!!!"
        }
}


fun atividade5()Unit{
    val jogo = jakenpo()
    println("escolha uma opção \n1-tesoura, \n2-papel \n3-pedra")
    if jogada =1 e numero sorteado =3
       jogada =3 e numero sorteado =2
       jogada =2 e numero sorteado =1
    return o jogador ganhou!!!
    return o computador ganhou!!!
}

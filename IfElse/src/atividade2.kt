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
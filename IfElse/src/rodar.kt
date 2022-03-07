class rodar {
    private var numeroSorteado:Int? = null

    private fun Sortear() = Random.nextInt(from:1,until:10)

    fun jogar(palpite:Int){
        numeroSorteado = sortear()

        if (palpite == numeroSorteado){
            return "Voce acertou o palpite!!!"
        }
 return"Lamento, voce errou o palpite. O numero correto é $numeroSorteado!!!!"
    }
}
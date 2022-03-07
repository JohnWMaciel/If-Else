class jakenpo {
    private var jogadorPC:Int? = null
    private var jogadorUsuario:Int? = null
/*

1 - pedra
2 - papel
3 - tesoura
 */
    fun jogar()
 if  (
    jogadorUsuario == 1 && jogadorPC == 3  ||
    jogadorUsuario == 2 && jogadorPC == 1  ||
    jogadorUsuario == 3 && jogadorPC == 2  ||
 ){
     return "Voce ganhou"
 }else{
     return "PC ganhou"
 }


}
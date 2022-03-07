import java.time.LocalDate

class PessoaJuridica(
    var cnpj: String,
    var razaoSocial: String,
    var nomeFantasia: String,
    var dataDeFundacao: LocalDate,
    // infos da classe mae
    endereco: String,
    telefone: String,
    email: String,
    codigo: Short,
) : Pessoa()
      var endereco: String,
      var telefone: String,
      var email: String,
      var codigo: Short,

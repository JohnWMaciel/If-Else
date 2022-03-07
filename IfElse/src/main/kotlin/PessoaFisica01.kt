import java.time.LocalDate

open class PessoaFisica01 (
        var rg: String,
        var CPF: String,
        var nome: String,
        var dataDeNascimento: LocalDate,
    // dados da class mae
   telefone: String,
   email: String,
   endereco: String,
  ) : Pessoa(
    telefone = telefone,
    email = email,
    endereco = endereco,

    )




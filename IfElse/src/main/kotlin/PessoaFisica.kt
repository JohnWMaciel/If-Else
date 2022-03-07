import java.time.LocalDate

open class PessoaFisica (
     var cpf: String,
     var rg: String,
     var nomeCompleto: String,
     var dataDeNascimento: LocalDate,
     // infos do class mae
     telefone: String,
     endereco: String,
     codigo: Short,
     email: String,
   ) : Pessoa(
    codigo =codigo,
    telefone = telefone,
    endereco = endereco,
    email = email,









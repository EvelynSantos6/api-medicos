package med.voll.api;

import med.voll.api.medico.Endereco;

public record DadosCadastroPaciente(
        String nome,
        String email,
        String telefone,
        String cpf,
        Endereco endereco) {
}

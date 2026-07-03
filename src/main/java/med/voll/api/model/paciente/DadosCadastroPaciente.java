package med.voll.api.model.paciente;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroPaciente(

        @NotBlank
         String nome,

        @NotBlank
        @Email
         String email,

        @NotBlank
         String telefone,

        @NotBlank
        String cpf) {
}

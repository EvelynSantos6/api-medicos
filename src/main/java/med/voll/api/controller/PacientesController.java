package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.model.paciente.DadosCadastroPaciente;
import med.voll.api.model.paciente.DadosListagemPaciente;
import med.voll.api.model.paciente.Paciente;
import med.voll.api.repository.PacienteRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pacientes")
public class PacientesController {

    private PacienteRepository repository;

    @PostMapping
    public void cadastrar(@RequestBody @Valid DadosCadastroPaciente dados){
        repository.save(new Paciente(dados));
    }

    @GetMapping
    public Page<DadosListagemPaciente> listar(@PageableDefault(size = 10, sort = {"name"})Pageable paginacao) {
       return repository.findAll(paginacao).map(DadosListagemPaciente::new);
    }


}

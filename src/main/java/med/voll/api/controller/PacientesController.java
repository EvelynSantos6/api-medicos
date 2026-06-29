package med.voll.api.controller;

import med.voll.api.medico.DadosCadastroMedico;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pacientes")
public class PacientesController {

    public void cadastrar(@RequestBody DadosCadastroMedico dados){
        System.out.println("dados recebidos:" + dados);
    }
}

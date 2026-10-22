package br.fiap.assistencia.controller;


import br.fiap.assistencia.domain.Cliente;
import br.fiap.assistencia.dto.ClienteRequest;
import br.fiap.assistencia.dto.ClienteResponse;
import br.fiap.assistencia.service.ClienteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
@AllArgsConstructor
public class ClienteController {
    private final ClienteService service;
    @PostMapping("/salvar")
    public ClienteResponse salvar(@RequestBody ClienteRequest dto){
        return service.salvar(dto);
    }
}

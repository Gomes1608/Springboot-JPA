package br.fiap.assistencia.service;

import br.fiap.assistencia.domain.Cliente;
import br.fiap.assistencia.dto.ClienteRequest;
import br.fiap.assistencia.dto.ClienteResponse;
import br.fiap.assistencia.mapper.Mapper;
import br.fiap.assistencia.repository.ClienteRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClienteService {
    private final ClienteRepository repo;
    private final Mapper mapper;

    @Transactional
    public ClienteResponse salvar(ClienteRequest dto){
        Cliente cliente = mapper.paraEntidade(dto);
        Cliente clienteSalvo = repo.save(cliente);
        return  mapper.paraResposta(cliente);
    }
}

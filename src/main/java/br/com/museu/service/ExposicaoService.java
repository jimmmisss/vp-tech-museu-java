package br.com.museu.service;

import br.com.museu.model.Exposicao;
import br.com.museu.repository.ExposicaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExposicaoService {

    @Autowired
    private ExposicaoRepository repository;

    public Exposicao salvar(Exposicao exposicao) {
        return repository.save(exposicao);
    }

    public Exposicao findById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public List<Exposicao> listarTodos() {
        return repository.findAll();
    }

}

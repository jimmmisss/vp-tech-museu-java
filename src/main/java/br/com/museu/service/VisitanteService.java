package br.com.museu.service;

import br.com.museu.model.Visitante;
import br.com.museu.repository.VisitanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitanteService {

    @Autowired
    private VisitanteRepository repository;

    public Visitante salvar(Visitante visitante) {
        return repository.save(visitante);
    }

    public List<Visitante> listarTodos() {
        return repository.findAll();
    }

    public Visitante findById(Long id) {
        return repository.findById(id).orElseThrow();
    }
}

package br.com.museu.service;

import br.com.museu.model.Exposicao;
import br.com.museu.model.RegistroVisita;
import br.com.museu.model.Visitante;
import br.com.museu.repository.RegistroVisitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class RegistroVisitaService {

    @Autowired
    private RegistroVisitaRepository repository;

    public RegistroVisita salvar(Visitante visitanteId, Exposicao exposicaoId) {
        RegistroVisita visita = RegistroVisita.builder()
                .visitante(visitanteId)
                .exposicao(exposicaoId)
                .dataHoraEntrada(LocalDateTime.now())
                .build();
        return repository.save(visita);
    }

    public RegistroVisita buscarPorId(Long id) {
        return repository.findById(id).orElseThrow();
    }
}

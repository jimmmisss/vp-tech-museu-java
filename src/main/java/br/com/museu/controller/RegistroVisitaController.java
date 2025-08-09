package br.com.museu.controller;

import br.com.museu.model.Exposicao;
import br.com.museu.model.RegistroVisita;
import br.com.museu.model.Visitante;
import br.com.museu.service.ExposicaoService;
import br.com.museu.service.RegistroVisitaService;
import br.com.museu.service.VisitanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/visitas")
public class RegistroVisitaController {

    @Autowired
    private RegistroVisitaService service;

    @Autowired
    VisitanteService visitanteService;

    @Autowired
    ExposicaoService exposicaoService;

    @PostMapping
    public RegistroVisita salvar(
            @RequestParam Long visitanteId,
            @RequestParam Long exposicaoId
    ) {
        Visitante vId = visitanteService.findById(visitanteId);
        Exposicao eId = exposicaoService.findById(exposicaoId);
        return service.salvar(vId, eId);
    }

    @GetMapping("/{id}")
    public RegistroVisita buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }
}

package br.com.museu.controller;

import br.com.museu.model.Visitante;
import br.com.museu.service.VisitanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/visitantes")
public class VisitanteController {

    @Autowired
    private VisitanteService service;

    @PostMapping
    public Visitante cadastrar(@RequestBody Visitante visitante) {
        return service.salvar(visitante);
    }

    @GetMapping
    public List<Visitante> listarTodos() {
        return service.listarTodos();
    }
}

package br.com.museu.controller;

import br.com.museu.model.Exposicao;
import br.com.museu.service.ExposicaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exposicoes")
public class ExposicaoController {

    @Autowired
    private ExposicaoService service;

    @PostMapping
    public Exposicao salvar(@RequestBody Exposicao exposicao) {
        return service.salvar(exposicao);
    }

    @GetMapping("/{id}")
    public Exposicao buscarPorId(@PathVariable Long id) {
        return service.findById(id);
    }

    @GetMapping
    public List<Exposicao> listarTodos() {
        return service.listarTodos();
    }
}

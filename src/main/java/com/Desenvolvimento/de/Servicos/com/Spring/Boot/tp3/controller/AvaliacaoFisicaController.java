package com.Desenvolvimento.de.Servicos.com.Spring.Boot.tp3.controller;

import com.Desenvolvimento.de.Servicos.com.Spring.Boot.tp3.entitis.AvaliacaoFisica;
import com.Desenvolvimento.de.Servicos.com.Spring.Boot.tp3.service.AvaliacaoFisicaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {

    private final AvaliacaoFisicaService service;

    public AvaliacaoFisicaController(AvaliacaoFisicaService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<AvaliacaoFisica> cadastrar(@RequestBody AvaliacaoFisica avaliacaoFisica) {
        return ResponseEntity.ok().body(service.cadastrar(avaliacaoFisica));
    }

    @GetMapping("/aluno/{idAluno}")
    public ResponseEntity<List<AvaliacaoFisica>> listarPorAluno(@PathVariable Long idAluno) {
        return ResponseEntity.ok().body(service.listarPorAluno(idAluno));
    }
}

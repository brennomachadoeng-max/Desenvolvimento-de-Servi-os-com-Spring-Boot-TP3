package com.Desenvolvimento.de.Servicos.com.Spring.Boot.tp3.service;

import com.Desenvolvimento.de.Servicos.com.Spring.Boot.tp3.entitis.AvaliacaoFisica;
import com.Desenvolvimento.de.Servicos.com.Spring.Boot.tp3.repository.AvaliacaoFisicaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvaliacaoFisicaService {

    private final AvaliacaoFisicaRepository repository;

    public AvaliacaoFisicaService(AvaliacaoFisicaRepository repository) {
        this.repository = repository;
    }

    public AvaliacaoFisica cadastrar(AvaliacaoFisica avaliacaoFisica) {
        return repository.save(avaliacaoFisica);
    }

    public List<AvaliacaoFisica> listarPorAluno(Long idAluno) {
        return repository.findByIdAluno(idAluno);
    }
}

package com.Desenvolvimento.de.Servicos.com.Spring.Boot.tp3.repository;

import com.Desenvolvimento.de.Servicos.com.Spring.Boot.tp3.entitis.AvaliacaoFisica;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface AvaliacaoFisicaRepository extends MongoRepository<AvaliacaoFisica, Long> {
    List<AvaliacaoFisica> findByIdAluno(Long idAluno);
}

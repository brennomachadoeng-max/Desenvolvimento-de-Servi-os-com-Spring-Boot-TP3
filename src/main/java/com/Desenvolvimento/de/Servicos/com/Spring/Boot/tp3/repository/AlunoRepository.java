package com.Desenvolvimento.de.Servicos.com.Spring.Boot.tp3.repository;

import com.Desenvolvimento.de.Servicos.com.Spring.Boot.tp3.entitis.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

    List<Aluno> findByStatusTrue();
}

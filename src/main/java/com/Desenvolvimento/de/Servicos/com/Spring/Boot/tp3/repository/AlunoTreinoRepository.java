package com.Desenvolvimento.de.Servicos.com.Spring.Boot.tp3.repository;

import com.Desenvolvimento.de.Servicos.com.Spring.Boot.tp3.dto.RankingAlunoDTO;
import com.Desenvolvimento.de.Servicos.com.Spring.Boot.tp3.entitis.AlunoTreino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AlunoTreinoRepository extends JpaRepository<AlunoTreino, Long> {


    @Query("""
            SELECT new com.Desenvolvimento.de.Servicos.com.Spring.Boot.tp3.dto.RankingAlunoDTO(
                at.aluno.nome,
                COUNT(at)
            )
            FROM AlunoTreino at
            WHERE at.statusConclusao = true
            GROUP BY at.aluno.nome
            ORDER BY COUNT(at) DESC
            """)
    List<RankingAlunoDTO> rankingAlunos();
}

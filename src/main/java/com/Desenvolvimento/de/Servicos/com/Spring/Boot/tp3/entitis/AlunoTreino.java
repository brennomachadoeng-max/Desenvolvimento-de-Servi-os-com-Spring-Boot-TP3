package com.Desenvolvimento.de.Servicos.com.Spring.Boot.tp3.entitis;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class AlunoTreino {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public Date dataInicio;
    public boolean statusConclusao;

    @ManyToOne
    @JoinColumn(name = "id_treino")
    public Treino treino;

    @ManyToOne
    @JoinColumn(name = "id_aluno")
    public Aluno aluno;
}

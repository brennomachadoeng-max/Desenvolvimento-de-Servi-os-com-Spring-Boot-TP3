package com.Desenvolvimento.de.Servicos.com.Spring.Boot.tp3.entitis;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Plano {

    @Id
    public Long id;
    public String nomePlano;
    public double valor;

    @OneToMany(mappedBy = "plano", cascade = CascadeType.ALL)
    public List<Aluno> alunos;
}

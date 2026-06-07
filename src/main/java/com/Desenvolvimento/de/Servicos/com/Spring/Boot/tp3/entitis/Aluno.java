package com.Desenvolvimento.de.Servicos.com.Spring.Boot.tp3.entitis;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String nome;
    public String email;
    public Date dataNascimento;
    public boolean status;

    @ManyToOne
    @JoinColumn(name="id_plano")
    public Plano plano;

    @OneToMany(mappedBy = "aluno")
    public List<AlunoTreino> treinos;
}

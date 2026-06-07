package com.Desenvolvimento.de.Servicos.com.Spring.Boot.tp3.entitis;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Treino {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String nomeTreino;
    public String focoPrincipal;

    @ManyToOne
    @JoinColumn(name = "id_instrutor")
    public Instrutor instrutor;

    @OneToMany(mappedBy = "treino")
    public List<AlunoTreino> alunos;
}

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
public class Instrutor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public String nome;
    public String cref;

    @OneToMany(mappedBy = "instrutor", cascade = CascadeType.ALL)
    public List<Treino> treinos;
}

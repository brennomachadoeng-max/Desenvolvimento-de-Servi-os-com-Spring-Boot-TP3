package com.Desenvolvimento.de.Servicos.com.Spring.Boot.tp3.entitis;

import org.springframework.data.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "avaliacao_fisica")
public class AvaliacaoFisica {

    @Id
    private Long id;
    private Long idAluno;
    private Float peso;
    private Float altura;
    private Double percentualGordura ;
    private String anotacoesMedicas;
}

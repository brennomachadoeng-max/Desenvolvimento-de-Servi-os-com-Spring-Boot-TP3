package com.Desenvolvimento.de.Servicos.com.Spring.Boot.tp3.dto.aluno;

import lombok.Data;

import java.util.Date;

@Data
public class AlunoResponseDTO {
    private Long id;
    private String nome;
    private String email;
    private Date dataNascimento;
    private boolean status;
}

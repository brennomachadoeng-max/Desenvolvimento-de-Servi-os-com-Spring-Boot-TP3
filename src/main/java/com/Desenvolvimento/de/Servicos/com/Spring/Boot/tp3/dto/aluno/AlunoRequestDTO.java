package com.Desenvolvimento.de.Servicos.com.Spring.Boot.tp3.dto.aluno;

import com.Desenvolvimento.de.Servicos.com.Spring.Boot.tp3.entitis.Plano;
import lombok.Data;

import java.util.Date;

@Data
public class AlunoRequestDTO {
    private String nome;
    private String email;
    private Date dataNascimento;
    private Plano plano;
}

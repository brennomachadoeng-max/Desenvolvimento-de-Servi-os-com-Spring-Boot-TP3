package com.Desenvolvimento.de.Servicos.com.Spring.Boot.tp3.dto.treino;

import com.Desenvolvimento.de.Servicos.com.Spring.Boot.tp3.entitis.Instrutor;
import lombok.Data;

import java.util.Date;

@Data
public class TreinoRequestDTO {
    private String nomeTreino;
    private String focoPrincipal;
    private Instrutor instrutor;
}

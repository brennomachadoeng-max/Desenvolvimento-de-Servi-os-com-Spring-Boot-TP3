package com.Desenvolvimento.de.Servicos.com.Spring.Boot.tp3.controller;

import com.Desenvolvimento.de.Servicos.com.Spring.Boot.tp3.dto.treino.TreinoRequestDTO;
import com.Desenvolvimento.de.Servicos.com.Spring.Boot.tp3.dto.treino.TreinoResponseDTO;
import com.Desenvolvimento.de.Servicos.com.Spring.Boot.tp3.entitis.Treino;
import com.Desenvolvimento.de.Servicos.com.Spring.Boot.tp3.service.TreinoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/treino")
public class TreinoController {

    private final TreinoService treinoService;

    public TreinoController(TreinoService treinoService) {
        this.treinoService = treinoService;
    }

    @PostMapping
    public ResponseEntity<TreinoResponseDTO> cadastrarTreino(@RequestBody TreinoRequestDTO treinoRequestDTO){
        Treino treino = treinoService.cadastrar(treinoRequestDTO);
        TreinoResponseDTO treinoResponseDTO = treinoService.TreinoParaTreinoResponseDTO(treino);
        return ResponseEntity.ok(treinoResponseDTO);
    }
}

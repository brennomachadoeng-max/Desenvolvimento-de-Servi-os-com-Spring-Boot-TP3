package com.Desenvolvimento.de.Servicos.com.Spring.Boot.tp3.controller;

import com.Desenvolvimento.de.Servicos.com.Spring.Boot.tp3.dto.aluno.AlunoRequestDTO;
import com.Desenvolvimento.de.Servicos.com.Spring.Boot.tp3.dto.aluno.AlunoResponseDTO;
import com.Desenvolvimento.de.Servicos.com.Spring.Boot.tp3.entitis.Aluno;
import com.Desenvolvimento.de.Servicos.com.Spring.Boot.tp3.service.AlunoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @PostMapping
    public ResponseEntity<AlunoResponseDTO> Cadastrar(@RequestBody AlunoRequestDTO alunoRequestDTO){
        Aluno aluno = alunoService.criarAluno(alunoRequestDTO);
        AlunoResponseDTO alunoResponseDTO = alunoService.AlunoParaAlunoResponse(aluno);
        return ResponseEntity.status(HttpStatus.CREATED).body(alunoResponseDTO);
    }

    @GetMapping("/ativos")
    public ResponseEntity<List<AlunoResponseDTO>> AlunosAtivos(){
        List<AlunoResponseDTO> alunoResponseDTOS = alunoService.listarAlunosAtivos();
        return ResponseEntity.status(HttpStatus.OK).body(alunoResponseDTOS);

    }
}

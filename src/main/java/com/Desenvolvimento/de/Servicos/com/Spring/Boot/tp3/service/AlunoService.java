package com.Desenvolvimento.de.Servicos.com.Spring.Boot.tp3.service;

import com.Desenvolvimento.de.Servicos.com.Spring.Boot.tp3.dto.aluno.AlunoRequestDTO;
import com.Desenvolvimento.de.Servicos.com.Spring.Boot.tp3.dto.aluno.AlunoResponseDTO;
import com.Desenvolvimento.de.Servicos.com.Spring.Boot.tp3.entitis.Aluno;
import com.Desenvolvimento.de.Servicos.com.Spring.Boot.tp3.repository.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {
    private final AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public Aluno criarAluno(AlunoRequestDTO alunoRequestDTO){
        Aluno aluno = AlunoRequestDTOParaAluno(alunoRequestDTO);
        return alunoRepository.save(aluno);
    }
    public List<AlunoResponseDTO> listarAlunosAtivos(){
        List<Aluno> alunos = alunoRepository.findByStatusTrue();
        return alunos.stream().map(this::AlunoParaAlunoResponse).toList();
    }

    public Aluno AlunoRequestDTOParaAluno(AlunoRequestDTO alunoRequestDTO){
        Aluno aluno = new Aluno();
        aluno.setNome(alunoRequestDTO.getNome());
        aluno.setEmail(alunoRequestDTO.getEmail());
        aluno.setDataNascimento(alunoRequestDTO.getDataNascimento());
        aluno.setPlano(alunoRequestDTO.getPlano());
        return aluno;
    }
    public AlunoResponseDTO AlunoParaAlunoResponse(Aluno aluno){
        AlunoResponseDTO alunoResponseDTO = new AlunoResponseDTO();
        alunoResponseDTO.setId(aluno.getId());
        alunoResponseDTO.setNome(aluno.getNome());
        alunoResponseDTO.setEmail(aluno.getEmail());
        alunoResponseDTO.setDataNascimento(aluno.getDataNascimento());
        alunoResponseDTO.setStatus(aluno.isStatus());
        return alunoResponseDTO;
    }

}

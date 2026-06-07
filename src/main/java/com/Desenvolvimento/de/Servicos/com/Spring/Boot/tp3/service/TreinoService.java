package com.Desenvolvimento.de.Servicos.com.Spring.Boot.tp3.service;

import com.Desenvolvimento.de.Servicos.com.Spring.Boot.tp3.dto.treino.TreinoRequestDTO;
import com.Desenvolvimento.de.Servicos.com.Spring.Boot.tp3.dto.treino.TreinoResponseDTO;
import com.Desenvolvimento.de.Servicos.com.Spring.Boot.tp3.entitis.Treino;
import com.Desenvolvimento.de.Servicos.com.Spring.Boot.tp3.repository.TreinoRepository;
import org.springframework.stereotype.Service;

@Service
public class TreinoService {

    private final TreinoRepository treinoRepository;

    public TreinoService(TreinoRepository treinoRepository) {
        this.treinoRepository = treinoRepository;
    }

    public Treino cadastrar(TreinoRequestDTO treinoRequestDTO) {
        Treino treino = TreinoRequestDTOParaTreino(treinoRequestDTO);
        return treinoRepository.save(treino);
    }

    public Treino TreinoRequestDTOParaTreino(TreinoRequestDTO treinoRequestDTO){
        Treino treino = new Treino();
        treino.setNomeTreino(treinoRequestDTO.getNomeTreino());
        treino.setFocoPrincipal(treinoRequestDTO.getFocoPrincipal());
        treino.setInstrutor(treinoRequestDTO.getInstrutor());
        return treino;
    }
    public TreinoResponseDTO TreinoParaTreinoResponseDTO(Treino treino){
        TreinoResponseDTO treinoResponseDTO = new TreinoResponseDTO();
        treinoResponseDTO.setId(treino.getId());
        treinoResponseDTO.setNomeTreino(treino.getNomeTreino());
        treinoResponseDTO.setFocoPrincipal(treino.getFocoPrincipal());
        treinoResponseDTO.setNomeTreino(treino.getInstrutor().getNome());
        return treinoResponseDTO;
    }
}

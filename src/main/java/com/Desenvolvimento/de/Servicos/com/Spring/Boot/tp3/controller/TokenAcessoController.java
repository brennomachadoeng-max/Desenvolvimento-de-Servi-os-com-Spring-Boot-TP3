package com.Desenvolvimento.de.Servicos.com.Spring.Boot.tp3.controller;

import com.Desenvolvimento.de.Servicos.com.Spring.Boot.tp3.service.TokenAcessoService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/catraca")
public class TokenAcessoController {

    private final TokenAcessoService service;

    public TokenAcessoController(TokenAcessoService service) {
        this.service = service;
    }

    @PostMapping("/gerar/{idAluno}")
    public String gerarToken(@PathVariable Long idAluno) {

        return service.gerarToken(idAluno);
    }

    @GetMapping("/validar/{token}")
    public boolean validarToken(@PathVariable String token) {
        return service.validarToken(token);
    }
}
package com.Desenvolvimento.de.Servicos.com.Spring.Boot.tp3.service;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

@Service
public class TokenAcessoService {

    private final RedisTemplate<String, String> redisTemplate;

    public TokenAcessoService(RedisTemplate<String, String> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    public String gerarToken(Long idAluno) {

        String token = UUID.randomUUID().toString();

        redisTemplate.opsForValue().set(
                token,
                idAluno.toString(),
                5,
                TimeUnit.MINUTES
        );

        return token;
    }

    public boolean validarToken(String token) {

        return redisTemplate.hasKey(token);
    }
}
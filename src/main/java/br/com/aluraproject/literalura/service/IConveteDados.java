package br.com.aluraproject.literalura.service;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface IConveteDados {
    <T> T obterDados(String json, Class<T> classe) throws JsonProcessingException;
}

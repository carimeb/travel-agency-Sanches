package com.sanches.viagens.rest;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class EstadoDetalhesResponse {
    final private String erro;
    private String estado;
    private String populacao;
    private String cidadeMaisFamosa;

    public EstadoDetalhesResponse(String erro) {
        this.erro = erro;
    }
}

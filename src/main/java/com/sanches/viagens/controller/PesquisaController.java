package com.sanches.viagens.controller;

import com.sanches.viagens.enums.EstadoDetalhes;
import com.sanches.viagens.rest.EstadoDetalhesResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class PesquisaController {

    @GetMapping("/estado-detalhes")
    public ResponseEntity<EstadoDetalhesResponse> estadosDetalhes(@RequestParam String estado){
        EstadoDetalhesResponse body = estado.isBlank()
                ? new EstadoDetalhesResponse("O nome do estado é obrigatório")
                : EstadoDetalhes.responseOf(estado);

        return ResponseEntity.ok(body);

    }

}

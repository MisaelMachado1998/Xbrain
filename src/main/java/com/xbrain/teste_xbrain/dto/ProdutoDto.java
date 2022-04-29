package com.xbrain.teste_xbrain.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class ProdutoDto {

    private UUID id;
    private String nome;
    private String valor;

}

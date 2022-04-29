package com.xbrain.teste_xbrain.dto;

import lombok.Data;

import java.util.UUID;
@Data
public class EntregaDto {

    private UUID id;
    private String endereco;
    private UUID idPedido;
}
